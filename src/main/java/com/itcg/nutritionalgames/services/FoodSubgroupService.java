package com.itcg.nutritionalgames.services;

import com.itcg.nutritionalgames.entities.FoodGroup;
import com.itcg.nutritionalgames.entities.FoodSubgroup;
import com.itcg.nutritionalgames.repositories.FoodGroupRepository;
import com.itcg.nutritionalgames.repositories.FoodSubgroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FoodSubgroupService {

    private final FoodSubgroupRepository foodSubgroupRepository;

    public List<FoodSubgroup> findAllFoodSubgroups() {
        return foodSubgroupRepository.findAll();
    }

    public Optional<FoodSubgroup> findFoodGroupByFoodGroupId(Integer foodGroupId) {
        return foodSubgroupRepository.findById(foodGroupId);
    }

    public Optional<FoodSubgroup> findFoodSubgroupBySubgroupId(Integer foodSubgroupId) {
        return foodSubgroupRepository.findById(foodSubgroupId);
    }

}
