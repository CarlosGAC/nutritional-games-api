package com.itcg.nutritionalgames.controllers;

import com.itcg.nutritionalgames.entities.Game;
import com.itcg.nutritionalgames.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// TODO: Finish the Game Controller
// TODO: Write the FK mappings

@RestController
public class GameController {

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("v1/games")
    public List<Game> findAllGames() {
        return gameService.findAllGames();
    }

    @GetMapping(value = "v1/games", params = "name")
    public Game findGameByName(String name) {
        return gameService.findByName(name);
    }

    @GetMapping("v1/games/{game_id}")
    public Game findGameByGameId(@PathVariable(value = "game_id") Integer gameId) {
        return gameService.findGameById(gameId);
    }
}
