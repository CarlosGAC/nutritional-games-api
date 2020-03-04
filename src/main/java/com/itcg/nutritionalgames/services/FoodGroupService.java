package com.itcg.nutritionalgames.services;

import com.itcg.nutritionalgames.entities.Food;
import com.itcg.nutritionalgames.entities.FoodGroup;
import com.itcg.nutritionalgames.entities.RecommendedCalories;
import com.itcg.nutritionalgames.exception.EntityNotFoundException;
import com.itcg.nutritionalgames.repositories.FoodGroupRepository;
import com.itcg.nutritionalgames.repositories.FoodRepository;
import com.itcg.nutritionalgames.repositories.PbcGroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FoodGroupService {

    private final FoodGroupRepository foodGroupRepository;
    private final FoodRepository foodRepository;
    private final PbcGroupRepository pbcGroupRepository;

    public FoodGroup findFoodGroupByGroupId(Integer groupId) {
        return foodGroupRepository.findById(groupId)
                .orElseThrow(() -> new EntityNotFoundException("No food group could be found with group_id = " + groupId));
    }

    public FoodGroup findFoodGroupByName(String name) {
        return foodGroupRepository.findByName(name)
                .orElseThrow(() -> new EntityNotFoundException("No food group could be found with name = " + name));
    }

    public List<FoodGroup> findAllFoodGroups() {
        List<FoodGroup> foodGroupsList = foodGroupRepository.findAll();

        if(foodGroupsList.isEmpty()) {
            throw new EntityNotFoundException("No food groups could be found at the  database");
        }
        return foodGroupsList;
    }

    public void saveFoodGroup(FoodGroup foodGroup) {
        foodGroupRepository.save(foodGroup);
    }

    public List<FoodGroup> findByPbcGroupId(Integer pbcGroupId) {
        pbcGroupRepository.findById(pbcGroupId)
                .orElseThrow(() -> new EntityNotFoundException("No food group could be found with pbc_group_id = " + pbcGroupId));

        List<FoodGroup> foodList = foodGroupRepository.findByPbcGroupId(pbcGroupId);

        if(foodList.isEmpty()) {
            throw new EntityNotFoundException("No food group could be found with pbc_group_id = " + pbcGroupId);
        }
        return foodList;
    }
}