package pl.mhordyjewicz.dto;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;
import pl.mhordyjewicz.entity.Category;

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

    private List<Category> tags;

    private List<Category> rewardTypes;

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

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
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

    public MultipartFile getImage()
    {
        return image;
    }

    public void setImage(MultipartFile image)
    {
        this.image = image;
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

    public Category getCategory()
    {
        return category;
    }

    public void setCategory(Category category)
    {
        this.category = category;
    }

    public List<Category> getTags()
    {
        return tags;
    }

    public void setTags(List<Category> tags)
    {
        this.tags = tags;
    }

    public List<Category> getRewardTypes()
    {
        return rewardTypes;
    }

    public void setRewardTypes(List<Category> rewardTypes)
    {
        this.rewardTypes = rewardTypes;
    }

    @Override
    public String toString()
    {
        return "ContestDTO{" +
                "title='" + title + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", shortDescription='" + shortDescription + '\'' +
                ", description='" + description + '\'' +
                ", organizer='" + organizer + '\'' +
                ", contestLink='" + contestLink + '\'' +
                ", rulesLink='" + rulesLink + '\'' +
                ", rewardDescription='" + rewardDescription + '\'' +
                ", category=" + category +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContestDTO that = (ContestDTO) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(title, that.title) &&
                Objects.equals(startDate, that.startDate) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endDate, that.endDate) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, title, startDate, startTime, endDate, endTime, description);
    }
}
