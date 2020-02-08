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
    @JsonProperty("group_id")
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
    private Integer age;

    @JsonProperty("genre")
    @Column(name = "genre")
    @Setter
    @Getter
    private String genre;

    @JsonProperty("recommended_calories_id")
    @Column(name = "recommended_calories_id")
    @Setter
    @Getter
    private Integer recommended_calories_id;

}
