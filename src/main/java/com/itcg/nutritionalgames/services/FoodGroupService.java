package com.itcg.nutritionalgames.services;

import com.itcg.nutritionalgames.entities.FoodGroup;
import com.itcg.nutritionalgames.entities.RecommendedCalories;
import com.itcg.nutritionalgames.exception.EntityNotFoundException;
import com.itcg.nutritionalgames.repositories.FoodGroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FoodGroupService {

    private final FoodGroupRepository foodGroupRepository;

    public FoodGroup findFoodGroupByGroupId(Integer groupId) {
        return foodGroupRepository.findById(groupId)
                .orElseThrow(() -> new EntityNotFoundException("No food group could be found with group_id = " + groupId));
    }

    public FoodGroup findFoodGroupByName(String name) {
        return foodGroupRepository.findByName(name)
                .orElseThrow(() -> new EntityNotFoundException("No food group could be found with name = " + name));
    }

    public List<FoodGroup> findAllFoodGroups() {
        return foodGroupRepository.findAll();
    }

    public void saveFoodGroup(FoodGroup foodGroup) {
        foodGroupRepository.save(foodGroup);
    }

}