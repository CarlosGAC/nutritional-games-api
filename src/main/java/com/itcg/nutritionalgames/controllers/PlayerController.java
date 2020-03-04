package com.itcg.nutritionalgames.controllers;

import com.itcg.nutritionalgames.entities.Player;
import com.itcg.nutritionalgames.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping(value = "v1/players")
    public List<Player> findAllPlayers() {
        return playerService.findAllPlayers();
    }

    @GetMapping(value = "v1/players/{player_id}", params="player_id")
    public Player findPlayerById(@PathVariable(value = "player_id") Integer playerId) {
        return playerService.findById(playerId);
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
