package com.itcg.nutritionalgames.controllers;

import com.itcg.nutritionalgames.entities.FoodSubgroup;
import com.itcg.nutritionalgames.services.FoodSubgroupService;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
        return foodSubgroupService.findAllFoodSubgroups();
    }

    @GetMapping(value="v1/foodSubgroups", params = "name")
    public FoodSubgroup getFoodSubgroupByName(@RequestParam(value = "name") String name) {
        return foodSubgroupService.findFoodSubgroupByName(name);
    }

    @GetMapping(value="/v1/foodSubgroups/{food_subgroup_id}")
    public FoodSubgroup getFoodSubgroupById(@PathVariable(name = "food_subgroup_id") Integer foodSubgroupId) {

        FoodSubgroup foundFoodSubgroup = foodSubgroupService.findFoodSubgroupBySubgroupId(foodSubgroupId);
        return foundFoodSubgroup;
    }

}
