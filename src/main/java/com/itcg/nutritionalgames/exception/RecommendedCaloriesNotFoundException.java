package com.itcg.nutritionalgames.exception;

import com.itcg.nutritionalgames.entities.RecommendedCalories;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RecommendedCaloriesNotFoundException extends RuntimeException {

    public RecommendedCaloriesNotFoundException(String s) {
        super(s);
    }

    public RecommendedCaloriesNotFoundException(Integer recommendedCaloriesId) {
        super("No Recommended Calories has been found with the recommended_calories_id = " + recommendedCaloriesId);
    }

    public RecommendedCaloriesNotFoundException() {
        super("No Recommended Calories has been found");
    }

}
