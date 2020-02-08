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
@Table(name = "food_group")
public class FoodGroup {

    @Id
    @Column(name = "group_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("group_id")
    @Setter
    @Getter
    private Integer groupId;

    @JsonProperty("name")
    @Column(name = "name")
    @Setter
    @Getter
    private String name;

    @JsonProperty("daily_portion_amount")
    @Column(name = "daily_portion_amount")
    @Setter
    @Getter
    private Integer amount;

    @JsonProperty("recommended_calories_id")
    @Column(name = "recommended_calories_id")
    @Setter
    @Getter
    private Integer recommendedCaloriesId;

}
