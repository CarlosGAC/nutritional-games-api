package com.itcg.nutritionalgames.repositories;

import com.itcg.nutritionalgames.entities.FoodGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FoodGroupRepository extends JpaRepository<FoodGroup, Integer> {

    Optional<FoodGroup> findByName(String name);

    List<FoodGroup> findAll();
    List<FoodGroup> findByPbcGroupId(Integer pbcGroupId);

}