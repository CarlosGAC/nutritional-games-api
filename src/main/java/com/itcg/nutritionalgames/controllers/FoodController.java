package com.itcg.nutritionalgames.controllers;

import com.itcg.nutritionalgames.entities.Food;
import com.itcg.nutritionalgames.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoodController {

    private final FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping(value = "v1/food")
    public List<Food> findAllFood() {
        return foodService.findAllFood();
    }

    @GetMapping(value = "v1/food", params = "name")
    public Food findFoodByName(@RequestParam(value = "name") String name) {
        return foodService.findFoodByName(name);
    }

    @GetMapping(value = "v1/food", params = "measure")
    public List<Food> findFoodByMeasure(@RequestParam(value = "measure") String measure) {
        return foodService.findFoodByMeasure(measure);
    }

    @GetMapping(value = "v1/food", params = "portion_amount")
    public List<Food> findFoodByPortionAmount(@RequestParam(value = "portion_amount") Short portionAmount) {
        return foodService.findFoodByPortionAmount(portionAmount);
    }

    @GetMapping(value = "v1/food", params = "calories")
    public List<Food> findFoodByCalories(@RequestParam(value = "calories") Short calories) {
        return foodService.findFoodByCalories(calories);
    }

    @GetMapping(value = "v1/food/{food_id}")
    public Food findFoodById(@PathVariable(value = "food_id") Integer foodId) {
        return foodService.findFoodById(foodId);
    }

}
