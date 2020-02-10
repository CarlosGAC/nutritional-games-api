package com.itcg.nutritionalgames.repositories;

import com.itcg.nutritionalgames.entities.FoodGroup;
import com.itcg.nutritionalgames.entities.RecommendedCalories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FoodGroupRepository extends JpaRepository<FoodGroup, Integer> {

    Optional<FoodGroup> findByGroupId(Integer foodGroup);

    Optional<FoodGroup> findByName(String name);

    List<FoodGroup> findAll();

}