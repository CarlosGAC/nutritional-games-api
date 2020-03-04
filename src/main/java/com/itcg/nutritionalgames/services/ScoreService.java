package com.itcg.nutritionalgames.services;

import com.itcg.nutritionalgames.entities.Score;
import com.itcg.nutritionalgames.exception.EntityNotFoundException;
import com.itcg.nutritionalgames.repositories.ScoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ScoreService {

    private final ScoreRepository scoreRepository;

    public List<Score> findAllScores() {
        List<Score> scoresList = scoreRepository.findAll();

        if(scoresList.isEmpty()) {
            throw new EntityNotFoundException("No scores could be found at the Database");
        }
        return scoresList;
    }

    public List<Score> findScoreByDate(Date date) {
        List<Score> scoresList = scoreRepository.findByDate(date);

        if(scoresList.isEmpty()) {
            throw new EntityNotFoundException("No scores could be found with date = " + date);
        }
        return scoresList;
    }

    public List<Score> findScoreByGameId(Integer gameId) {
        List<Score> scoresList = scoreRepository.findByGameId(gameId);

        if(scoresList.isEmpty()) {
            throw new EntityNotFoundException("No scores could be found with game_id = " + gameId);
        }
        return scoresList;
    }

    public List<Score> findScoreByPlayerId(Integer playerId) {
        List<Score> scoresList = scoreRepository.findByPlayerId(playerId);

        if(scoresList.isEmpty()) {
            throw new EntityNotFoundException("No scores could be found with player_id = " + playerId);
        }
        return scoresList;
    }

    public Score findScoreByScoreId(Integer scoreId) {
        return scoreRepository.findById(scoreId)
                .orElseThrow(() -> new EntityNotFoundException("No score could be found with score_id = " + scoreId));
    }
}
