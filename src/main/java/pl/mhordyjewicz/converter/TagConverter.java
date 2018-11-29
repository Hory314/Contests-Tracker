package pl.mhordyjewicz.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.mhordyjewicz.entity.Category;
import pl.mhordyjewicz.entity.Tag;
import pl.mhordyjewicz.repository.CategoryRepository;
import pl.mhordyjewicz.repository.TagRepository;

public class TagConverter implements Converter<String, Tag>
{
    @Autowired
    TagRepository tagRepository;

    @Override
    public Tag convert(String tag)
    {
        try
        {
            Long id = Long.parseLong(tag);
            return tagRepository.findOne(id);
        }
        catch (Exception e)
        {
            return null;
        }
    }
}
