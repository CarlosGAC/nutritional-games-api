package com.itcg.nutritionalgames.services;

import com.itcg.nutritionalgames.entities.FoodGroup;
import com.itcg.nutritionalgames.entities.FoodSubgroup;
import com.itcg.nutritionalgames.exception.EntityNotFoundException;
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
        List<FoodSubgroup> foodSubgroupList = foodSubgroupRepository.findAll();
        if(foodSubgroupList.isEmpty()) {
            throw new EntityNotFoundException("No food subgroups could be found at the database");
        }
        return foodSubgroupList;
    }

    public FoodSubgroup findFoodSubgroupBySubgroupId(Integer foodSubgroupId) {
        return foodSubgroupRepository.findById(foodSubgroupId)
                .orElseThrow(() -> new EntityNotFoundException("No food subgroup could be found with id = " + foodSubgroupId));
    }

    public FoodSubgroup findFoodSubgroupByName(String name) {
        return foodSubgroupRepository.findFoodSubgroupByName(name)
                .orElseThrow(() -> new EntityNotFoundException("No food subgroup could be found with name = " + name));
    }

}
