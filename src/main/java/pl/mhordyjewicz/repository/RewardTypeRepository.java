package pl.mhordyjewicz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mhordyjewicz.entity.RewardType;

public interface RewardTypeRepository extends JpaRepository<RewardType, Long>
{
}
