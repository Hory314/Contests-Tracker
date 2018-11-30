package pl.mhordyjewicz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.mhordyjewicz.dto.CategoryDTO;
import pl.mhordyjewicz.entity.Category;
import pl.mhordyjewicz.repository.CategoryRepository;

import javax.validation.Valid;
import java.util.List;

@Service
@Transactional
public class CategoryService
{
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAllCategories()
    {
        return categoryRepository.findAll();
    }

    public void deleteCategory(Long id)
    {
        categoryRepository.delete(id);
    }

    public void saveCategory(@Valid CategoryDTO categoryDTO)
    {
        Category category = new Category();
        category.setName(categoryDTO.getName());

        categoryRepository.save(category);
    }
}
