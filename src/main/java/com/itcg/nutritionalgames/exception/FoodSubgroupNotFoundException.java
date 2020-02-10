package com.itcg.nutritionalgames.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FoodSubgroupNotFoundException extends RuntimeException{

    public FoodSubgroupNotFoundException(String s) {
        super(s);
    }

    public FoodSubgroupNotFoundException() {
        super("No Food Subgroup has been found");
    }

    public FoodSubgroupNotFoundException(Integer foodSubgroupId) {
        super("No Food Subgroup has been found with the subgroup_id = " + foodSubgroupId);
    }

}
