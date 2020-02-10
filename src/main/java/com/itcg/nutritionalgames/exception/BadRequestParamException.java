package com.itcg.nutritionalgames.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestParamException extends RuntimeException {

    public BadRequestParamException(String s) {
        super(s);
    }
}
