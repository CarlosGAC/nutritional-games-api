package com.itcg.nutritionalgames.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DailyPortionNotFoundException extends RuntimeException{

    public DailyPortionNotFoundException(Short amount) {
        super("No Daily Portion has been found with the amount = " + amount);
    }

    public DailyPortionNotFoundException(String s) {
        super(s);
    }

}
