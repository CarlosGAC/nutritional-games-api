package com.itcg.nutritionalgames.controllers;

import com.itcg.nutritionalgames.entities.Player;
import com.itcg.nutritionalgames.entities.Score;
import com.itcg.nutritionalgames.services.PlayerService;
import com.itcg.nutritionalgames.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PlayerController {

    private final PlayerService playerService;
    private final ScoreService scoreService;

    @Autowired
    public PlayerController(PlayerService playerService, ScoreService scoreService) {
        this.playerService = playerService;
        this.scoreService = scoreService;
    }

    @GetMapping(value = "v1/players")
    public List<Player> findAllPlayers() {
        return playerService.findAllPlayers();
    }

    @PostMapping(value = "v1/players")
    public Player savePlayer(@RequestBody Player player) {
        return playerService.saveNewPlayer(player);
    }

    @GetMapping(value = "v1/players/{player_id}")
    public Player findPlayerById(@PathVariable(value = "player_id") Integer playerId) {
        return playerService.findById(playerId);
    }

    @GetMapping(value = "v1/players/{player_id}/scores", params="player_id")
    public List<Score> findScoresPlayerById(@PathVariable(value = "player_id") Integer playerId) {
        return scoreService.findScoreByPlayerId(playerId);
    }

    @GetMapping(value = "v1/players", params="gender")
    public List<Player> findPlayersByGender(@RequestParam(value = "gender") String gender) {
        return playerService.findByGender(gender);
    }

    @GetMapping(value = "v1/players", params="name")
    public List<Player> findPlayersByName(@RequestParam(value = "name") String name) {
        return playerService.findByName(name);
    }
}
