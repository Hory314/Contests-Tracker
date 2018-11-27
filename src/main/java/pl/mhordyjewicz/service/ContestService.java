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

import javax.validation.Valid;
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

    public void save(@Valid ContestDTO contestDTO)
    {
        Contest contest = new Contest();
        contest.setTitle(contestDTO.getTitle());
        contest.setDescription(contestDTO.getDescription());
        contest.setShortDescription(contestDTO.getShortDescription());
        contest.setContestLink(contestDTO.getContestLink());
        contest.setOrganizer(contestDTO.getOrganizer());
        contest.setRewardDescription(contestDTO.getRewardDescription());
        // contest.setImage(contestDTO.getImage());
        contest.setRulesLink(contestDTO.getRulesLink());
        LocalDateTime ldt = LocalDateTime.of(contestDTO.getStartDate(), contestDTO.getStartTime());


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

        contestRepository.save(contest);
    }
}
