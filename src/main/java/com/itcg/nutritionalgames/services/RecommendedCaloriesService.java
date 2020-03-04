package com.itcg.nutritionalgames.services;

import com.itcg.nutritionalgames.entities.RecommendedCalories;
import com.itcg.nutritionalgames.exception.EntityNotFoundException;
import com.itcg.nutritionalgames.repositories.RecommendedCaloriesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RecommendedCaloriesService {

    private final RecommendedCaloriesRepository recommendedCaloriesRepository;

    public RecommendedCalories findRecommendedCaloriesById(Integer recommendedCaloriesId) {
        return recommendedCaloriesRepository.findById(recommendedCaloriesId)
                .orElseThrow(() -> new EntityNotFoundException("No recommended calories could be found with recommended_calories_id = " + recommendedCaloriesId));
    }

    public List<RecommendedCalories> findAllRecommendedCalories() {
        List<RecommendedCalories> recommendedCaloriesList = recommendedCaloriesRepository.findAll();
        if(recommendedCaloriesList.isEmpty()) {
            throw new EntityNotFoundException("No recommended calories could be found at the database");
        }
        return recommendedCaloriesList;
    }

}
