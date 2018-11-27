package pl.mhordyjewicz.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.mhordyjewicz.entity.Category;
import pl.mhordyjewicz.repository.CategoryRepository;

public class TagConverter implements Converter<String , Category>
{
   @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Category convert(String s)
    {
        try
        {
            Long id = Long.parseLong(s);
            Category category = categoryRepository.findOne(id);
            category.setType("tag");
            return category;
        }
        catch (Exception e)
        {
            return null;
        }
    }
}
