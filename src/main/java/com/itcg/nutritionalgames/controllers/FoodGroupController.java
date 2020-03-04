package com.itcg.nutritionalgames.controllers;

import com.itcg.nutritionalgames.entities.Food;
import com.itcg.nutritionalgames.entities.FoodGroup;
import com.itcg.nutritionalgames.services.FoodGroupService;
import com.itcg.nutritionalgames.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FoodGroupController {

    @Autowired
    public FoodGroupController(FoodGroupService foodGroupService, FoodService foodService) {
        this.foodGroupService = foodGroupService;
        this.foodService = foodService;
    }

    private final FoodGroupService foodGroupService;
    private final FoodService foodService;

    @GetMapping(value = "v1/foodGroups")
    public List<FoodGroup> getAllFoodGroups() {

        List<FoodGroup> response = foodGroupService.findAllFoodGroups();
        return response;
    }

    @GetMapping(value = "v1/foodGroups", params="name")
    public FoodGroup getAllFoodGroups(@RequestParam(value = "name") String name) {
        FoodGroup response = foodGroupService.findFoodGroupByName(name);
        return response;
    }


    @GetMapping(value = "v1/foodGroups/{food_group_id}")
    public FoodGroup getFoodGroupById(@PathVariable(name = "food_group_id") Integer foodGroupId) {

        FoodGroup foundFoodGroup = foodGroupService.findFoodGroupByGroupId(foodGroupId);

        return foundFoodGroup;
    }

    @GetMapping(value = "v1/foodGroups/{food_group_id}/food")
    public List<Food> getFoodByFoodGroupId(@PathVariable(name = "food_group_id") Integer foodGroupId) {

        List<Food> foundFood = foodService.findFoodByFoodGroupId(foodGroupId);

        return foundFood;
    }

}
