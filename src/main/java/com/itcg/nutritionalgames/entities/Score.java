package com.itcg.nutritionalgames.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "score")
public class Score {

    @Id
    @Column(name = "score_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("score_id")
    @Setter
    @Getter
    private Integer scoreId;

    @JsonProperty("amount")
    @Column(name = "amount")
    @Setter
    @Getter
    private Integer amount;

    @JsonProperty("date")                   
    @Column(name = "date")
    @Setter
    @Getter
    private Date date;

    @JsonProperty("starting_time")
    @Column(name = "starting_time")
    @Setter
    @Getter
    private Time startingTime;

    @JsonProperty("ending_time")
    @Column(name = "ending_time")
    @Setter
    @Getter
    private Time endingTime;

    @JsonProperty("player_id")
    @Column(name = "player_id")
    @Setter
    @Getter
    private Integer playerId;

    @JsonProperty("game_id")
    @Column(name = "game_id")
    @Setter
    @Getter
    private Integer gameId;

}
