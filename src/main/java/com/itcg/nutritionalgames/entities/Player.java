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
@Table(name = "player")
public class Player {

    @Id
    @Column(name = "player_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("player_id")
    @Setter
    @Getter
    private Integer playerId;

    @JsonProperty("name")
    @Column(name = "name")
    @Setter
    @Getter
    private String name;

    @JsonProperty("password")
    @Column(name = "password")
    @Setter
    @Getter
    private String password;

    @JsonProperty("age")
    @Column(name = "age")
    @Setter
    @Getter
    private Short age;

    @JsonProperty("gender")
    @Column(name = "gender")
    @Setter
    @Getter
    private String gender;

    @JsonProperty("recommended_calories_id")
    @Column(name = "recommended_calories_id")
    @Setter
    @Getter
    private Integer recommended_calories_id;

}
