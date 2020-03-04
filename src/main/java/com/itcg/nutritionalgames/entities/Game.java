package com.itcg.nutritionalgames.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "game")
public class Game {

    @Id
    @Column(name = "game_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("game_id")
    @Setter
    @Getter
    private Integer gameId;

    @JsonProperty("name")
    @Column(name = "name")
    @Setter
    @Getter
    private String name;

    @JsonProperty("max_score")
    @Column(name = "max_score")
    @Setter
    @Getter
    private Integer maxScore;

}
