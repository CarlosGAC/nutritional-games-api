package com.itcg.nutritionalgames.repositories;

import com.itcg.nutritionalgames.entities.FoodGroup;
import com.itcg.nutritionalgames.entities.FoodSubgroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FoodSubgroupRepository extends JpaRepository<FoodSubgroup, Integer> {

    Optional<FoodSubgroup> findFoodSubgroupByName(String name);

    List<FoodSubgroup> findAll();

}
