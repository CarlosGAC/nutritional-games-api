package com.itcg.nutritionalgames.controllers;

import com.itcg.nutritionalgames.entities.DailyPortion;
import com.itcg.nutritionalgames.services.DailyPortionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DailyPortionController {

    private final DailyPortionService dailyPortionService;

    @Autowired
    public DailyPortionController(DailyPortionService dailyPortionService) {
        this.dailyPortionService = dailyPortionService;
    }

    @GetMapping("v1/dailyPortions")
    public List<DailyPortion> findAllDailyPortions() {
        return dailyPortionService.findAllDailyPortions();
    }

    @GetMapping(value = "v1/dailyPortions", params = "amount")
    public List<DailyPortion> findDailyPortionsByAmount(@RequestParam(name = "amount") Short amount) {
        return dailyPortionService.findByAmount(amount);
    }

    @GetMapping("v1/dailyPortions/{daily_portion_id}")
    public DailyPortion findDailyPortionById(@PathVariable(name = "daily_portion_id") Integer dailyPortionId) {
        return dailyPortionService.findById(dailyPortionId);
    }

}
