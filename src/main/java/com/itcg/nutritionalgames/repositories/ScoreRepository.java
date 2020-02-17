package com.itcg.nutritionalgames.repositories;

import com.itcg.nutritionalgames.entities.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Integer> {
    List<Score> findAll();
    List<Score> findByDate(Date date);
    List<Score> findByGameId(Integer gameId);
    List<Score> findByPlayerId(Integer playerId);
}
