package com.itcg.nutritionalgames.services;

import com.itcg.nutritionalgames.entities.FoodGroup;
import com.itcg.nutritionalgames.entities.RecommendedCalories;
import com.itcg.nutritionalgames.repositories.FoodGroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FoodGroupService {

    private final FoodGroupRepository foodGroupRepository;

    public Optional<FoodGroup> findFoodGroupByGroupId(Integer groupId) {
        return foodGroupRepository.findById(groupId);
    }

    public Optional<FoodGroup> findFoodGroupByName(String name) {
        return foodGroupRepository.findByName(name);
    }

    public List<FoodGroup> findAllFoodGroups() {
        return foodGroupRepository.findAll();
    }

    public void saveFoodGroup(FoodGroup foodGroup) {
        foodGroupRepository.save(foodGroup);
    }

}