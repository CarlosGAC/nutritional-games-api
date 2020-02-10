package com.itcg.nutritionalgames.services;

import com.itcg.nutritionalgames.entities.RecommendedCalories;
import com.itcg.nutritionalgames.repositories.RecommendedCaloriesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RecommendedCaloriesService {

    private final RecommendedCaloriesRepository recommendedCaloriesRepository;

    public Optional<RecommendedCalories> findRecommendedCaloriesById(Integer id) {
        return recommendedCaloriesRepository.findById(id);
    }

    public List<RecommendedCalories> findAllRecommendedCalories() {
        return recommendedCaloriesRepository.findAll();
    }

    public void saveRecommendedCalories(RecommendedCalories recommendedCalories) {
        recommendedCaloriesRepository.save(recommendedCalories);
    }

}
