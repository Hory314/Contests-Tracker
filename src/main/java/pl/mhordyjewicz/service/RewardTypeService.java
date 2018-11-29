package pl.mhordyjewicz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.mhordyjewicz.entity.RewardType;
import pl.mhordyjewicz.repository.RewardTypeRepository;

import java.util.List;

@Service
@Transactional
public class RewardTypeService
{
    @Autowired
    RewardTypeRepository rewardTypeRepository;

    public List<RewardType> getAllRewardTypes()
    {
        return rewardTypeRepository.findAll();
    }
}
