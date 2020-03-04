package com.itcg.nutritionalgames.services;

import com.itcg.nutritionalgames.entities.Food;
import com.itcg.nutritionalgames.exception.EntityNotFoundException;
import com.itcg.nutritionalgames.repositories.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;

    public List<Food> findAllFood() {
        List<Food> foodList = foodRepository.findAll();

        if(foodList.isEmpty()) {
            throw new EntityNotFoundException("No food could be found at the database");
        }

        return foodList;
    }

    public Food findFoodByName(String name) {
        return foodRepository.findByName(name)
                .orElseThrow(() -> new EntityNotFoundException("No food could be found with name = " + name));
    }

    public Food findFoodById(Integer foodId) {
        return foodRepository.findById(foodId)
                .orElseThrow(() ->  new EntityNotFoundException("No food could be found with food_id : " + foodId));
    }

    public List<Food> findFoodByMeasure(String measure) {
        List<Food> foodList = foodRepository.findByMeasure(measure);

        if(foodList.isEmpty()) {
            throw new EntityNotFoundException("No food could be found with measure = " + measure);
        }
        return foodList;
    }

    public List<Food> findFoodByPortionAmount(short portionAmount) {
        List<Food> foodList = foodRepository.findByPortionAmount(portionAmount);

        if(foodList.isEmpty()) {
            throw new EntityNotFoundException("No food could be found with portion_amount = " + portionAmount);
        }
        return foodList;
    }

    public List<Food> findFoodByCalories(short calories) {
        List<Food> foodList = foodRepository.findByCalories(calories);

        if(foodList.isEmpty()) {
            throw new EntityNotFoundException("No food could be found with calories = " + calories);
        }
        return foodList;
    }

}
