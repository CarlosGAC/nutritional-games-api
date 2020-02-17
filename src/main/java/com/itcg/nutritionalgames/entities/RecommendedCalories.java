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
@Table(name = "recommended_calories")
public class RecommendedCalories {

    @Id
    @Column(name = "recommended_calories_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("group_id")
    @Setter
    @Getter
    private Integer recommendedCaloriesId;

    @JsonProperty("amount")
    @Column(name = "amount")
    @Setter
    @Getter
    private Short amount;

}
