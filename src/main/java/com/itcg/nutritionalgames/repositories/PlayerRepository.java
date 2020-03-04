package com.itcg.nutritionalgames.repositories;

import com.itcg.nutritionalgames.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

    List<Player> findAll();

    List<Player> findByName(String name);
    List<Player> findByGender(String gender);
    List<Player> findByAge(Short age);

    List<Player> findByNameAndGender(String name, String gender);
    List<Player> findByNameAndAge(String name, Short age);
    List<Player> findByGenderAndAge(String gender, Short age);

    List<Player> findByNameAndGenderAndAge(String name, String gender, Short age);
}
