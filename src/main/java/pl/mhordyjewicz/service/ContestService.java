package pl.mhordyjewicz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.mhordyjewicz.dto.ContestDTO;
import pl.mhordyjewicz.entity.Category;
import pl.mhordyjewicz.entity.Contest;
import pl.mhordyjewicz.repository.CategoryRepository;
import pl.mhordyjewicz.repository.ContestRepository;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
            // add path to entity
            contest.setImage(imagePathOnServer);
            // save to db
            contestRepository.save(contest);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public List<Contest> getAllContests()
    {
        List<Contest> contests = contestRepository.findAll();
        contests.forEach(c -> c.getCategories().size()); // lazy load
        return contests;
    }

    public Contest getContest(Long id)
    {
        return contestRepository.findOne(id);
    }

    public List<Contest> getAllAcceptedContests()
    {
        return contestRepository.findByAccepted();
    }

    public void toggleAccepted(Long id)
    {
        Contest contest = contestRepository.findOne(id);

        if (contest.getAccepted())
        {
            contest.setAccepted(false);
        }
        else
        {
            contest.setAccepted(true);
        }
        contestRepository.save(contest);
    }

    public void delete(Long id)
    {
        contestRepository.delete(id);
    }

    public ContestDTO getContestDTO(Long id)
    {
        ContestDTO contestDTO = new ContestDTO();
        Contest contest = contestRepository.getOne(id);
        contestDTO.setId(contest.getId());
        contestDTO.setTitle(contest.getTitle());
        contestDTO.setShortDescription(contest.getShortDescription());
        contestDTO.setDescription(contest.getDescription());
        contestDTO.setContestLink(contest.getContestLink());
        contestDTO.setRulesLink(contest.getRulesLink());
        contestDTO.setRewardDescription(contest.getRewardDescription());
        //contestDTO.setCategory(contest.getCategories());
        contestDTO.setStartDate(contest.getStartDate().toLocalDate());
        contestDTO.setStartTime(contest.getStartDate().toLocalTime());
        contestDTO.setEndDate(contest.getEndDate().toLocalDate());
        contestDTO.setEndTime(contest.getEndDate().toLocalTime());

        // todo continue here


        return contestDTO;
    }
}
