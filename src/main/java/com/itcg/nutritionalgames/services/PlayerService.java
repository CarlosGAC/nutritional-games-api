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

    public Player saveNewPlayer(Player newPlayer) {
        return playerRepository.save(newPlayer);
    }

    public List<Player> findAllPlayers() {
        List<Player> playersList = playerRepository.findAll();

        if(playersList.isEmpty()) {
            throw new EntityNotFoundException("No players could be found at the database");
        }
        return playersList;
    }

    public Player findById(Integer playerId) {
        return playerRepository.findById(playerId)
                .orElseThrow(() -> new EntityNotFoundException("No player could be found with player_id = " + playerId));
    }

    public List<Player> findByName(String name) {
        List<Player> playersList = playerRepository.findByName(name);
        System.out.println(playersList.isEmpty());
        if(playersList.isEmpty()) {
            throw new EntityNotFoundException("No players could be found with name = " + name);
        }
        return playersList;
    }

    public List<Player> findByGender(String gender) {
        List<Player> playersList = playerRepository.findByGender(gender);
        System.out.println(playersList.isEmpty());
        if(playersList.isEmpty()) {
            throw new EntityNotFoundException("No players could be found with gender = " + gender);
        }
        return playersList;
    }

    public List<Player> findByAge(Short age) {
        List<Player> playersList = playerRepository.findByAge(age);
        if(playersList.isEmpty()) {
            throw new EntityNotFoundException("No players could be found with age = " + age);
        }
        return playersList;
    }

    public List<Player> findByNameAndGender(String name, String gender) {
        List<Player> playersList = playerRepository.findByNameAndGender(name, gender);
        if(playersList.isEmpty()) {
            throw new EntityNotFoundException("No players could be found with name = " + name +  "and gender = " + gender);
        }
        return playersList;
    }

    public List<Player> findByNameAndAge(String name, Short age) {
        List<Player> playersList = playerRepository.findByNameAndAge(name, age);
        if(playersList.isEmpty()) {
            throw new EntityNotFoundException("No players could be found with name = " + name +
                    "and age = " + age);
        }
        return playersList;
    }

    public List<Player> findByGenderAndAge(String gender, Short age) {
        List<Player> playersList = playerRepository.findByGenderAndAge(gender, age);
        if(playersList.isEmpty()) {
            throw new EntityNotFoundException("No players could be found with gender = " + gender +
                    "and age = " + age);
        }
        return playersList;
    }

    public List<Player> findByNameAndGenderAndAge(String name, String gender, Short age) {
        List<Player> playersList = playerRepository.findByNameAndGenderAndAge(name, gender, age);
        if(playersList.isEmpty()) {
            throw new EntityNotFoundException("No players could be found with name = " + name +
                    " and gender = " + gender +
                    "and age = " + age);
        }
        return playersList;
    }


}
