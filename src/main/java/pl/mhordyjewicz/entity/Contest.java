package pl.mhordyjewicz.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "contests")
public class Contest
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String organizer;

    @Column(name = "short_description", columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String description;

    @Column(name = "start_date", nullable = false, columnDefinition = "DATETIME")
    private LocalDateTime startDate;

    @Column(name = "end_date", nullable = false, columnDefinition = "DATETIME")
    private LocalDateTime endDate;

    @Column(name = "contest_link")
    private String contestLink;

    @Column(name = "rules_link")
    private String rulesLink;

    private String image;

    @Column(name = "reward_description", columnDefinition = "TEXT")
    private String rewardDescription;

    private String email;

    @Column(name = "user_accepted")
    private Boolean userAccepted;

    @ManyToOne
    private Category category;

    @ManyToMany
    private List<Tag> tags;

    @ManyToMany
    private List<RewardType> rewardTypes;

//    @Column(nullable = false, columnDefinition = "BIT DEFAULT TRUE") // todo change to false later
    private Boolean accepted;

    //  @Column(nullable = false, columnDefinition = "VARCHAR(255) DEFAULT to_base64(random_bytes(32))")
    private String editHash;

    public String getEmail()
    {
        return email;
    }

    public Boolean getUserAccepted()
    {
        return userAccepted;
    }

    public void setUserAccepted(Boolean userAccepted)
    {
        this.userAccepted = userAccepted;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEditHash()
    {
        return editHash;
    }

    public void setEditHash(String editHash)
    {
        this.editHash = editHash;
    }

    public Boolean getAccepted()
    {
        return accepted;
    }

    public void setAccepted(Boolean accepted)
    {
        this.accepted = accepted;
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

    public String getOrganizer()
    {
        return organizer;
    }

    public void setOrganizer(String organizer)
    {
        this.organizer = organizer;
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

    public LocalDateTime getStartDate()
    {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate)
    {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate()
    {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate)
    {
        this.endDate = endDate;
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

    public String getImage()
    {
        return image;
    }

    public void setImage(String image)
    {
        this.image = image;
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

    public String getFormattedStartDate()
    {
        return formatDate(this.startDate);
    }

    public String getFormattedEndDate()
    {
        return formatDate(this.endDate);
    }

    private String formatDate(LocalDateTime date)
    {
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
    }

    @Override
    public String toString()
    {
        return "Contest{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", organizer='" + organizer + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", contestLink='" + contestLink + '\'' +
                ", rulesLink='" + rulesLink + '\'' +
                ", image='" + image + '\'' +
                ", rewardDescription='" + rewardDescription + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contest contest = (Contest) o;
        return Objects.equals(id, contest.id);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }

    public String getSimpleTitle()
    {
        return this.title.replaceAll("\\s", "-").toLowerCase();
    }
}
