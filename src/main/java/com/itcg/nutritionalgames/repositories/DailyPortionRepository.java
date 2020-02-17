package com.itcg.nutritionalgames.repositories;

import com.itcg.nutritionalgames.entities.DailyPortion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DailyPortionRepository extends JpaRepository<DailyPortion, Integer> {

    List<DailyPortion> findAll();
    Optional<DailyPortion> findByAmount(Short amount);

}
