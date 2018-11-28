package pl.mhordyjewicz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.mhordyjewicz.dto.ContestDTO;
import pl.mhordyjewicz.entity.Category;
import pl.mhordyjewicz.entity.Contest;
import pl.mhordyjewicz.repository.CategoryRepository;
import pl.mhordyjewicz.repository.ContestRepository;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ContestService
{
    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ContestRepository contestRepository;

    @Autowired
    FileUploadService fileUploadService;


    public void save(@Valid ContestDTO contestDTO, HttpServletRequest request)
    {
        Contest contest = new Contest();
        contest.setTitle(contestDTO.getTitle());
        contest.setDescription(contestDTO.getDescription());
        contest.setShortDescription(contestDTO.getShortDescription());
        contest.setContestLink(contestDTO.getContestLink());
        contest.setOrganizer(contestDTO.getOrganizer());
        contest.setRewardDescription(contestDTO.getRewardDescription());
        contest.setRulesLink(contestDTO.getRulesLink());
        contest.setStartDate(LocalDateTime.of(contestDTO.getStartDate(), contestDTO.getStartTime()));
        contest.setEndDate(LocalDateTime.of(contestDTO.getEndDate(), contestDTO.getEndTime()));

        List<Category> categories = new ArrayList<>();

        Category category = categoryRepository.findOne(contestDTO.getCategory().getId());

        // join all - categories, tags and reward types
        categories.add(category);
        contestDTO.getTags().forEach(c ->
        {
            categories.add(categoryRepository.findOne(c.getId()));
        });
        contestDTO.getRewardTypes().forEach(c ->
        {
            categories.add(categoryRepository.findOne(c.getId()));
        });
        contest.setCategories(categories);

        System.out.println("zapis obrazka...");
        try
        {
            // save image and get its path on the server
            String imagePathOnServer = fileUploadService.saveImage(contestDTO.getImage(), request);
            System.out.println(imagePathOnServer);
            // add path to entity
            contest.setImage(imagePathOnServer);
            System.out.println("Ścieżka do pliku (cs): " + imagePathOnServer);
            // save to db
            contestRepository.save(contest);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
