package pl.mhordyjewicz.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.mhordyjewicz.entity.Category;
import pl.mhordyjewicz.entity.RewardType;
import pl.mhordyjewicz.repository.CategoryRepository;
import pl.mhordyjewicz.repository.RewardTypeRepository;

public class RewardTypeConverter implements Converter<String , RewardType>
{
    @Autowired
    RewardTypeRepository rewardTypeRepository;

    @Override
    public RewardType convert(String reward_type)
    {
        try
        {
            Long id = Long.parseLong(reward_type);
            return rewardTypeRepository.findOne(id);
        }
        catch (Exception e)
        {
            return null;
        }
    }
}
