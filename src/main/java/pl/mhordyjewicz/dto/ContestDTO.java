package pl.mhordyjewicz.dto;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;
import pl.mhordyjewicz.entity.Category;
import pl.mhordyjewicz.entity.RewardType;
import pl.mhordyjewicz.entity.Tag;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

public class ContestDTO
{
    private Long id;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 255)
    private String title;

    @NotNull
    private LocalDate startDate;

    @NotNull
    private LocalTime startTime;

    @NotNull
    private LocalDate endDate;

    @NotNull
    private LocalTime endTime;

    private String shortDescription;

    @NotNull
    @NotEmpty
    private String description;

    @NotNull
    @NotEmpty
    private String organizer;

    private String contestLink;

    private String rulesLink;

    @NotNull
    @NotEmpty
    private String rewardDescription;

    private MultipartFile image;

    @NotNull
    private Category category;

    private List<Tag> tags;

    private List<RewardType> rewardTypes;

    @Email
    @NotNull
    @NotEmpty
    private String email;

    private String imageURI;
// ------------ //


    @Override
    public String toString()
    {
        return "ContestDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", startDate=" + startDate +
                ", startTime=" + startTime +
                ", endDate=" + endDate +
                ", endTime=" + endTime +
                ", shortDescription='" + shortDescription + '\'' +
                ", description='" + description + '\'' +
                ", organizer='" + organizer + '\'' +
                ", contestLink='" + contestLink + '\'' +
                ", rulesLink='" + rulesLink + '\'' +
                ", rewardDescription='" + rewardDescription + '\'' +
                ", image=" + image +
                ", category=" + category +
                ", email='" + email + '\'' +
                ", imageURI='" + imageURI + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContestDTO that = (ContestDTO) o;
        return Objects.equals(title, that.title) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(title, email);
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public LocalDate getStartDate()
    {
        return startDate;
    }

    public void setStartDate(LocalDate startDate)
    {
        this.startDate = startDate;
    }

    public LocalTime getStartTime()
    {
        return startTime;
    }

    public void setStartTime(LocalTime startTime)
    {
        this.startTime = startTime;
    }

    public LocalDate getEndDate()
    {
        return endDate;
    }

    public void setEndDate(LocalDate endDate)
    {
        this.endDate = endDate;
    }

    public LocalTime getEndTime()
    {
        return endTime;
    }

    public void setEndTime(LocalTime endTime)
    {
        this.endTime = endTime;
    }

    public String getShortDescription()
    {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription)
    {
        this.shortDescription = shortDescription;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getOrganizer()
    {
        return organizer;
    }

    public void setOrganizer(String organizer)
    {
        this.organizer = organizer;
    }

    public String getContestLink()
    {
        return contestLink;
    }

    public void setContestLink(String contestLink)
    {
        this.contestLink = contestLink;
    }

    public String getRulesLink()
    {
        return rulesLink;
    }

    public void setRulesLink(String rulesLink)
    {
        this.rulesLink = rulesLink;
    }

    public String getRewardDescription()
    {
        return rewardDescription;
    }

    public void setRewardDescription(String rewardDescription)
    {
        this.rewardDescription = rewardDescription;
    }

    public MultipartFile getImage()
    {
        return image;
    }

    public void setImage(MultipartFile image)
    {
        this.image = image;
    }

    public Category getCategory()
    {
        return category;
    }

    public void setCategory(Category category)
    {
        this.category = category;
    }

    public List<Tag> getTags()
    {
        return tags;
    }

    public void setTags(List<Tag> tags)
    {
        this.tags = tags;
    }

    public List<RewardType> getRewardTypes()
    {
        return rewardTypes;
    }

    public void setRewardTypes(List<RewardType> rewardTypes)
    {
        this.rewardTypes = rewardTypes;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getImageURI()
    {
        return imageURI;
    }

    public void setImageURI(String imageURI)
    {
        this.imageURI = imageURI;
    }
}
