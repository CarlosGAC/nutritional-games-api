package com.itcg.nutritionalgames.repositories;

import com.itcg.nutritionalgames.entities.RecommendedCalories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RecommendedCaloriesRepository extends JpaRepository<RecommendedCalories, Integer> {

    Optional<RecommendedCalories> findById(Integer recommendedCaloriesId);

    List<RecommendedCalories> findAll();

}
