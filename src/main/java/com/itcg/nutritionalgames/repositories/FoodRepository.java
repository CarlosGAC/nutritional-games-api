package com.itcg.nutritionalgames.repositories;


import com.itcg.nutritionalgames.entities.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer> {
    Optional<Food> findByName(String name);
    List<Food> findByMeasure(String measure);
    List<Food> findByPortionAmount(short portionAmount);
    List<Food> findByCalories(short calories);
}
