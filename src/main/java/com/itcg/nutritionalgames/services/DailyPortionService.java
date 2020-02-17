package com.itcg.nutritionalgames.services;

import com.itcg.nutritionalgames.entities.DailyPortion;
import com.itcg.nutritionalgames.entities.FoodGroup;
import com.itcg.nutritionalgames.entities.FoodSubgroup;
import com.itcg.nutritionalgames.exception.DailyPortionNotFoundException;
import com.itcg.nutritionalgames.exception.EntityNotFoundException;
import com.itcg.nutritionalgames.repositories.DailyPortionRepository;
import com.itcg.nutritionalgames.repositories.FoodGroupRepository;
import com.itcg.nutritionalgames.repositories.FoodSubgroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DailyPortionService {
    private final DailyPortionRepository dailyPortionRepository;

    public List<DailyPortion> findAllDailyPortions() {
        return dailyPortionRepository.findAll();
    }

    public DailyPortion findByAmount(Short amount) {
        return dailyPortionRepository.findByAmount(amount)
                .orElseThrow(() -> new EntityNotFoundException("No daily portion could be found with amount = " + amount));
    }

}