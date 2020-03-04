package com.itcg.nutritionalgames.services;

import com.itcg.nutritionalgames.entities.Game;
import com.itcg.nutritionalgames.exception.EntityNotFoundException;
import com.itcg.nutritionalgames.repositories.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameRepository gameRepository;

    public List<Game> findAllGames() {
        List<Game> gameList = gameRepository.findAll();
        if(gameList.isEmpty()) {
            throw new EntityNotFoundException("No games could be found at the database");
        }
        return gameList;
    }

    public Game findGameById(Integer gameId) {
        return gameRepository.findById(gameId)
                .orElseThrow(() -> new EntityNotFoundException("No game could be found with game_id = " + gameId));
    }

    public Game findByName(String name) {
        return gameRepository.findByName(name)
                .orElseThrow(() -> new EntityNotFoundException("No game could be found with name = " + name));
    }

}
