package com.itcg.nutritionalgames.controllers;

import com.itcg.nutritionalgames.entities.FoodSubgroup;
import com.itcg.nutritionalgames.exception.FoodSubgroupNotFoundException;
import com.itcg.nutritionalgames.services.FoodSubgroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoodSubgroupController {


    @Autowired
    public FoodSubgroupController(FoodSubgroupService foodSubgroupService) {
        this.foodSubgroupService = foodSubgroupService;
    }

    private final FoodSubgroupService foodSubgroupService;

    @GetMapping(value="/v1/foodSubgroups")
    public List<FoodSubgroup> getAllFoodSubgroups() {

        List<FoodSubgroup> response = foodSubgroupService.findAllFoodSubgroups();

        if(response.isEmpty()) {
            throw new FoodSubgroupNotFoundException();
        }

        return response;
    }

    @GetMapping(value="/v1/foodSubgroups/{food_subgroup_id}")
    public FoodSubgroup getFoodSubgroupById(@PathVariable(name = "food_subgroup_id") Integer foodSubgroupId) {

        FoodSubgroup foundFoodSubgroup = foodSubgroupService.findFoodSubgroupBySubgroupId(foodSubgroupId)
                .orElseThrow(() -> new FoodSubgroupNotFoundException(foodSubgroupId));

        return foundFoodSubgroup;
    }


}
