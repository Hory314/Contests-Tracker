package pl.mhordyjewicz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mhordyjewicz.entity.Contest;

public interface ContestRepository extends JpaRepository<Contest, Long>
{
}
