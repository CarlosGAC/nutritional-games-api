package com.itcg.nutritionalgames.exception;

import com.itcg.nutritionalgames.entities.FoodGroup;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FoodGroupNotFoundException extends RuntimeException {

    public FoodGroupNotFoundException(String s) {
        super(s);
    }

    public FoodGroupNotFoundException(Integer recommendedCaloriesId) {
        super("No Food Group has been found with the group_id = " + recommendedCaloriesId);
    }

    public FoodGroupNotFoundException() {
        super("No Food Group has been found");
    }

}
