package com.itcg.nutritionalgames.repositories;

import com.itcg.nutritionalgames.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

    List<Player> findAll();
    Optional<Player> findByName(String name);
    Optional<Player> findByGender(String gender);
    List<Player> findByAge(Short age);
}
