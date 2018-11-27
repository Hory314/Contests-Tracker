package pl.mhordyjewicz.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.mhordyjewicz.entity.Category;
import pl.mhordyjewicz.repository.CategoryRepository;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class LocalDateConverter implements Converter<String, LocalDate>
{

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public LocalDate convert(String sDate)
    {
        try
        {
            return LocalDate.parse(sDate);
        }
        catch (DateTimeParseException e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
