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
        return categoryRepository.findAllByType("category");
    }

    public List<Category> getAllRewardTypes()
    {
        return categoryRepository.findAllByType("tag");
    }

    public List<Category> getAllTags()
    {
        return categoryRepository.findAllByType("reward_type");
    }

    public Category getCategory(Long id)
    {
        return categoryRepository.findOneByIdAndType(id, "category");
    }

    public Category getTag(Long id)
    {
        return categoryRepository.findOneByIdAndType(id, "tag");
    }

    public Category getRewardType(Long id)
    {
        return categoryRepository.findOneByIdAndType(id, "reward_type");
    }


    public void deleteCategory(Long id)
    {
        categoryRepository.delete(id);
    }

    public void saveCategory(@Valid CategoryDTO categoryDTO)
    {
        Category category = new Category();
        category.setName(categoryDTO.getName());
        category.setType(categoryDTO.getType());

        categoryRepository.save(category);
    }
}
