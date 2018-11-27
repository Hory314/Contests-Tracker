package pl.mhordyjewicz.controller.advice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.mhordyjewicz.entity.Category;
import pl.mhordyjewicz.service.CategoryService;

import java.util.List;

@ControllerAdvice
public class CommonControllerAdvice
{
    @Autowired
    CategoryService categoryService;

    @ModelAttribute("categories")
    List<Category> categories()
    {
        return categoryService.getAllCategories();
    }

    @ModelAttribute("tags")
    List<Category> tags()
    {
        return categoryService.getAllTags();
    }

    @ModelAttribute("rewardTypes")
    List<Category> rewardTypes()
    {
        return categoryService.getAllRewardTypes();
    }
}
