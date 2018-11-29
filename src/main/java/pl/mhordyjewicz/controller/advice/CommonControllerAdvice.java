package pl.mhordyjewicz.controller.advice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.mhordyjewicz.entity.Category;
import pl.mhordyjewicz.entity.RewardType;
import pl.mhordyjewicz.entity.Tag;
import pl.mhordyjewicz.service.CategoryService;
import pl.mhordyjewicz.service.RewardTypeService;
import pl.mhordyjewicz.service.TagService;

import java.util.List;

@ControllerAdvice
public class CommonControllerAdvice
{
    @Autowired
    CategoryService categoryService;

    @Autowired
    TagService tagService;

    @Autowired
    RewardTypeService rewardTypeService;

    @ModelAttribute("categories")
    List<Category> categories()
    {
        return categoryService.getAllCategories();
    }

    @ModelAttribute("tags")
    List<Tag> tags()
    {
        return tagService.getAllTags();
    }

    @ModelAttribute("rewardTypes")
    List<RewardType> rewardTypes()
    {
        return rewardTypeService.getAllRewardTypes();
    }
}
