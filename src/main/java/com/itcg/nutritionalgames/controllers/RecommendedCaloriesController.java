package com.itcg.nutritionalgames.controllers;

import com.itcg.nutritionalgames.entities.RecommendedCalories;
import com.itcg.nutritionalgames.exception.BadRequestBodyException;
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

    @GetMapping(value="/v1/recommendedCalories")
    public List<RecommendedCalories> findAllRecommendedCalories(){
        return recommendedCaloriesService.findAllRecommendedCalories();
    }

    @GetMapping(value="/v1/recommendedCalories/{recommended_calories_id}")
    public RecommendedCalories findRecommendedCaloriesById(@PathVariable(name = "recommended_calories_id") Integer recommendedCaloriesId) {
        return recommendedCaloriesService.findRecommendedCaloriesById(recommendedCaloriesId);
    }
}
