package com.itcg.nutritionalgames.controllers;

import com.itcg.nutritionalgames.entities.Score;
import com.itcg.nutritionalgames.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class ScoreController {

    private final ScoreService scoreService;

    @Autowired
    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @GetMapping("v1/scores")
    public List<Score> findAllScores() {
        return scoreService.findAllScores();
    }

    @GetMapping(value = "v1/scores", params = "date")
    public List<Score> findScoresByDate(Date date) {
        return scoreService.findScoreByDate(date);
    }

    @GetMapping(value = "v1/scores", params = "game_id")
    public List<Score> findScoresByGameId(Integer gameId) {
        return scoreService.findScoreByGameId(gameId);
    }

    @GetMapping(value = "v1/scores", params = "player_id")
    public List<Score> findScoresByPlayerId(Integer playerId) {
        return scoreService.findScoreByPlayerId(playerId);
    }

    @GetMapping(value = "v1/scores/{score_id}")
    public Score findScoreById(@PathVariable(value = "score_id") Integer scoreId) {
        return scoreService.findScoreByScoreId(scoreId);
    }

}
