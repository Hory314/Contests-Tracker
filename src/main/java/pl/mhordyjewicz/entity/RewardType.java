package pl.mhordyjewicz.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "reward_type")
public class RewardType
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToMany(mappedBy = "rewardTypes", fetch = FetchType.EAGER)
    private List<Contest> contests;

    public List<Contest> getContests()
    {
        return contests;
    }

    public void setContests(List<Contest> contests)
    {
        this.contests = contests;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RewardType that = (RewardType) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, name);
    }

    @Override
    public String toString()
    {
        return "RewardType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
