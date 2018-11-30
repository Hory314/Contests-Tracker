package pl.mhordyjewicz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.mhordyjewicz.dto.ContestDTO;
import pl.mhordyjewicz.entity.Category;
import pl.mhordyjewicz.entity.Contest;
import pl.mhordyjewicz.entity.RewardType;
import pl.mhordyjewicz.entity.Tag;
import pl.mhordyjewicz.repository.CategoryRepository;
import pl.mhordyjewicz.repository.ContestRepository;
import pl.mhordyjewicz.repository.RewardTypeRepository;
import pl.mhordyjewicz.repository.TagRepository;

import javax.servlet.http.HttpServletRequest;
import javax.swing.*;
import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

@Service
@Transactional
public class ContestService
{
    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    TagRepository tagRepository;

    @Autowired
    RewardTypeRepository rewardTypeRepository;

    @Autowired
    ContestRepository contestRepository;

    @Autowired
    FileUploadService fileUploadService;
//
//    @Autowired
//    MailSender mailSender;

//


    public void save(@Valid ContestDTO contestDTO, HttpServletRequest request)
    {
        Contest contest = new Contest();
        contest.setId(contestDTO.getId());// if comes null with dto = save, otherwise update
        contest.setTitle(contestDTO.getTitle());
        contest.setDescription(contestDTO.getDescription());
        contest.setShortDescription(contestDTO.getShortDescription());
        contest.setContestLink(contestDTO.getContestLink());
        contest.setOrganizer(contestDTO.getOrganizer());
        contest.setRewardDescription(contestDTO.getRewardDescription());
        contest.setRulesLink(contestDTO.getRulesLink());
        contest.setStartDate(LocalDateTime.of(contestDTO.getStartDate(), contestDTO.getStartTime()));
        contest.setEndDate(LocalDateTime.of(contestDTO.getEndDate(), contestDTO.getEndTime()));
        contest.setAccepted(false); // todo change
        contest.setUserAccepted(false); // todo change
        contest.setEmail(contestDTO.getEmail());

        Category category = categoryRepository.findOne(contestDTO.getCategory().getId());
        contest.setCategory(category);

        // tag list save to entity
        List<Tag> tags = new ArrayList<>();
        contestDTO.getTags().forEach(t ->
        {
            tags.add(tagRepository.findOne(t.getId()));
        });
        contest.setTags(tags);

        // reward list save to entity
        List<RewardType> rewardTypes = new ArrayList<>();
        contestDTO.getRewardTypes().forEach(r ->
        {
            rewardTypes.add(rewardTypeRepository.findOne(r.getId()));
        });
        contest.setRewardTypes(rewardTypes);

        try
        {
            Long id = contest.getId();
            if (contestDTO.getImage().getSize() != 0) // if image send
            {
                // save image and get its path on the server
                String imagePathOnServer = fileUploadService.saveImage(contestDTO.getImage(), request);
                // add path to entity
                contest.setImage(imagePathOnServer);
                // save to db
            }
            else // if not - keep previous one
            {
                if (id == null) // new post
                {
                    contest.setImage(null);
                }
                else // updating post
                {
                    contest.setImage(contestRepository.getOne(id).getImage());
                }
            }


            contestRepository.save(contest);

            if (id == null)
            {
                Contest c = contestRepository.getOne(contest.getId());
                System.out.println("Wysłano email z linkiem do aktywacji: " + "http://localhost:8080/activate?hash=" + c.getEditHash());
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

//    private void sendMail(String email, String editHash)
//    {
//        SimpleMailMessage smm = new SimpleMailMessage();
//
//        smm.setFrom("email@gmail.com");
//        smm.setTo("email@gmail.com");
//        smm.setSubject("title");
//        smm.setText("text");
//
//        mailSender.send(smm);
//    }

    public List<Contest> getAllContests()
    {
        List<Contest> all = contestRepository.findAll();
        all.forEach(c ->
        {
            c.getTags().size(); // lazy load
            c.getRewardTypes().size(); // lazy load
        });
        return all;
    }

    public Contest getContest(Long id)
    {

        Contest c = contestRepository.findOne(id);
        c.getTags().size(); // lazy
        c.getRewardTypes().size(); // lazy
        return c;
    }

    public List<Contest> getAllAcceptedContests()
    {
        return contestRepository.findByAccepted();
    }

    public void toggleAccepted(Long id)
    {
        Contest contest = contestRepository.findOne(id);

        if (contest.getAccepted() == true)
        {
            contest.setAccepted(false);
        }
        else
        {
            contest.setAccepted(true);
        }
        contestRepository.save(contest);
    }

    public void activate(String hash)
    {
        Contest contest = contestRepository.findOneByEditHash(hash);
        if (contest != null)
        {
            contest.setUserAccepted(true);
            contestRepository.save(contest);
        }
    }

    public void delete(Long id)
    {
        contestRepository.delete(id);
    }

    public ContestDTO getContestDTO(String hash)
    {
        Long id;
        try
        {
            id = contestRepository.findOneByEditHash(hash).getId();
        }
        catch (NullPointerException e)
        {
            return null;
        }
        return getContestDTO(id);
    }

    public ContestDTO getContestDTO(Long id)
    {
        ContestDTO contestDTO = new ContestDTO();
        Contest contest = contestRepository.getOne(id);

        contest.getTags().size(); // lazy
        contest.getRewardTypes().size(); // lazy

        contestDTO.setId(contest.getId());
        contestDTO.setTitle(contest.getTitle());
        contestDTO.setShortDescription(contest.getShortDescription());
        contestDTO.setDescription(contest.getDescription());
        contestDTO.setContestLink(contest.getContestLink());
        contestDTO.setRulesLink(contest.getRulesLink());
        contestDTO.setRewardDescription(contest.getRewardDescription());
        contestDTO.setStartDate(contest.getStartDate().toLocalDate());
        contestDTO.setStartTime(contest.getStartDate().toLocalTime());
        contestDTO.setEndDate(contest.getEndDate().toLocalDate());
        contestDTO.setEndTime(contest.getEndDate().toLocalTime());
        contestDTO.setEmail(contest.getEmail());
        contestDTO.setOrganizer(contest.getOrganizer());
        contestDTO.setCategory(contest.getCategory());
        contestDTO.setTags(contest.getTags());
        contestDTO.setRewardTypes(contest.getRewardTypes());
        contestDTO.setImageURI(contest.getImage());

        return contestDTO;
    }
}
