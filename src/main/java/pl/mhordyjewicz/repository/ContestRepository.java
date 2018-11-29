package pl.mhordyjewicz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.mhordyjewicz.entity.Contest;

import java.util.List;

public interface ContestRepository extends JpaRepository<Contest, Long>
{
    @Query("SELECT c FROM Contest c WHERE c.accepted = true")
    List<Contest> findByAccepted();
}
