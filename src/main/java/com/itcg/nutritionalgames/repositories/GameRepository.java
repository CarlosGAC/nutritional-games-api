package com.itcg.nutritionalgames.repositories;

import com.itcg.nutritionalgames.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {
    List<Game> findAll();
    Optional<Game> findByName(String name);

}
