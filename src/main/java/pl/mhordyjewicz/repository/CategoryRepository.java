package pl.mhordyjewicz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mhordyjewicz.entity.Category;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>
{
    List<Category> findAllByType(String type);

    Category findOneByIdAndType(Long id, String type);
}
