package pl.mhordyjewicz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mhordyjewicz.entity.Tag;

public interface TagRepository extends JpaRepository<Tag, Long>
{
}
