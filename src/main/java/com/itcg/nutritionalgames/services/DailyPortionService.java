package com.itcg.nutritionalgames.services;

import com.itcg.nutritionalgames.entities.DailyPortion;
import com.itcg.nutritionalgames.entities.FoodGroup;
import com.itcg.nutritionalgames.entities.FoodSubgroup;
import com.itcg.nutritionalgames.exception.DailyPortionNotFoundException;
import com.itcg.nutritionalgames.exception.EntityNotFoundException;
import com.itcg.nutritionalgames.repositories.DailyPortionRepository;
import com.itcg.nutritionalgames.repositories.FoodGroupRepository;
import com.itcg.nutritionalgames.repositories.FoodSubgroupRepository;
import com.itcg.nutritionalgames.repositories.PbcGroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DailyPortionService {
    private final DailyPortionRepository dailyPortionRepository;
    private final PbcGroupRepository pbcGroupRepository;

    public List<DailyPortion> findAllDailyPortions() {
        List<DailyPortion> dailyPortionsList = dailyPortionRepository.findAll();

        if(dailyPortionsList.isEmpty()) {
            throw new EntityNotFoundException("No daily portions could be found at the database") ;
        }
        return dailyPortionsList;
    }

    public List<DailyPortion> findByAmount(Short amount) {
        List<DailyPortion> response = dailyPortionRepository.findByAmount(amount);
        if(response.isEmpty()) {
            throw new EntityNotFoundException("No daily portions could be found with amount = " + amount);
        }
        return response;
    }

    public DailyPortion findById(Integer dailyPortionId) {
        return dailyPortionRepository.findById(dailyPortionId)
                .orElseThrow(() -> new EntityNotFoundException("No daily portion could be found with daily_portion_id = " + dailyPortionId));
    }

    public List<DailyPortion> findByPbcGroupId(Integer pbcGroupId) {
        pbcGroupRepository.findById(pbcGroupId)
                .orElseThrow(() -> new EntityNotFoundException("No pbc group could be found with pbc_group_id = " + pbcGroupId));

        List<DailyPortion> dailyPortionList = dailyPortionRepository.findByPbcGroupId(pbcGroupId);

        if(dailyPortionList.isEmpty()) {
            throw new EntityNotFoundException("No daily portion could be found with pbc_group_id = " + pbcGroupId);
        }

        return dailyPortionList;
    }

}