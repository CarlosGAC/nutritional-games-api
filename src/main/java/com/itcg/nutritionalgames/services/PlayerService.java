package com.itcg.nutritionalgames.services;

import com.itcg.nutritionalgames.entities.Player;
import com.itcg.nutritionalgames.exception.EntityNotFoundException;
import com.itcg.nutritionalgames.repositories.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerService {

    private final PlayerRepository playerRepository;

    public List<Player> findAllPlayers() {
        return playerRepository.findAll();
    }

    public Player findByPlayerName(String name) {
        return playerRepository.findByName(name)
                .orElseThrow(() -> new EntityNotFoundException("No player could be found with name = " + name));
    }

    public Player findByGender(String gender) {
        return playerRepository.findByGender(gender)
                .orElseThrow(() -> new EntityNotFoundException("No player could be found with gender = " + gender));
    }

    public List<Player> findByAge(Short age) {
        List<Player> playersList = playerRepository.findByAge(age);
        if(playersList.isEmpty()) {
            throw new EntityNotFoundException("No players could be found with age = " + age);
        }
        return playersList;
    }


}
