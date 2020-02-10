package com.itcg.nutritionalgames.controllers;

import com.itcg.nutritionalgames.entities.FoodGroup;
import com.itcg.nutritionalgames.exception.BadRequestBodyException;
import com.itcg.nutritionalgames.exception.BadRequestParamException;
import com.itcg.nutritionalgames.exception.FoodGroupNotFoundException;
import com.itcg.nutritionalgames.services.FoodGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodGroupController {

    @Autowired
    public FoodGroupController(FoodGroupService foodGroupService) {
        this.foodGroupService = foodGroupService;
    }

    private final FoodGroupService foodGroupService;

    @GetMapping(value = "/v1/foodGroups")
    public List<FoodGroup> getAllFoodGroups() {

        List<FoodGroup> response = foodGroupService.findAllFoodGroups();

        if (response.isEmpty()) {
            throw new FoodGroupNotFoundException();
        }

        return response;

    }

    @GetMapping(value = "/v1/foodGroups/{food_group_id}")
    public FoodGroup getFoodGroupById(@PathVariable(name = "food_group_id") Integer foodGroupId) {

        FoodGroup foundFoodGroup = foodGroupService.findFoodGroupByGroupId(foodGroupId)
                .orElseThrow(() -> new FoodGroupNotFoundException(foodGroupId));

        return foundFoodGroup;
    }

    @GetMapping(value = "/v1/foodGroups")
    public FoodGroup getFoodGroupByName(@RequestParam(value = "name") String name) {

        if (name.isEmpty()) {
            throw new BadRequestParamException("The request param name is empty");
        }

        FoodGroup foundFoodGroup = foodGroupService.findFoodGroupByName(name)
                .orElseThrow(() -> new FoodGroupNotFoundException("No Food Group has been found with the group_id = " + name));

        return foundFoodGroup;
    }

    @PostMapping(value = "/v1/foodGroups")
    public FoodGroup saveFoodGroup(@RequestBody FoodGroup foodGroup) {

        if (foodGroup.getAmount() == null) {
            throw new BadRequestBodyException("The amount can't be null");
        } else if (foodGroup.getAmount() <= 0) {
            throw new BadRequestBodyException("The amount can't be negative or zero");
        }

        foodGroupService.saveFoodGroup(foodGroup);
        return foodGroup;
    }

}
