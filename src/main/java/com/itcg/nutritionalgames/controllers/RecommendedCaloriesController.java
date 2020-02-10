package com.itcg.nutritionalgames.controllers;

import com.itcg.nutritionalgames.entities.RecommendedCalories;
import com.itcg.nutritionalgames.exception.BadRequestBodyException;
import com.itcg.nutritionalgames.exception.RecommendedCaloriesNotFoundException;
import com.itcg.nutritionalgames.services.RecommendedCaloriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class RecommendedCaloriesController {

    @Autowired
    public RecommendedCaloriesController(RecommendedCaloriesService recommendedCaloriesService) {
        this.recommendedCaloriesService = recommendedCaloriesService;
    }

    private final RecommendedCaloriesService recommendedCaloriesService;

    @GetMapping(value="/v1/recommended_calories")
    public List<RecommendedCalories> getAllRecommendedCalories(){

        List<RecommendedCalories> response = recommendedCaloriesService.findAllRecommendedCalories();

        if(response.isEmpty()) {
            throw new RecommendedCaloriesNotFoundException();
        } else {
            return response;
        }

    }

    @GetMapping(value="/v1/recommended_calories/{recommended_calories_id}")
    public RecommendedCalories getRecommendedCaloriesById(@PathVariable(name = "recommended_calories_id") Integer recommendedCaloriesId) {

        RecommendedCalories foundRecommendedCalories = recommendedCaloriesService.findRecommendedCaloriesById(recommendedCaloriesId)
                .orElseThrow(() -> new RuntimeException("The API couldn't find a record with recommended_calories_id = " + recommendedCaloriesId));

        return foundRecommendedCalories;
    }

    @PostMapping(value="/v1/recommended_calories")
    public RecommendedCalories saveRecommendedCalories(@RequestBody RecommendedCalories recommendedCalories) {

        if(recommendedCalories.getAmount() == null) {
            throw new BadRequestBodyException("The amount can't be null");
        } else if(recommendedCalories.getAmount() <= 0) {
            throw new BadRequestBodyException("The amount can't be negative or zero");
        }

        recommendedCaloriesService.saveRecommendedCalories(recommendedCalories);
        return recommendedCalories;
    }
}