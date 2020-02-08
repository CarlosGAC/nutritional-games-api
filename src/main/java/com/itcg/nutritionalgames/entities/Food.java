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
@Table(name = "food")
public class Food {

    @Id
    @Column(name = "food_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("food_id")
    @Setter
    @Getter
    private Integer foodId;

    @JsonProperty("name")
    @Column(name = "name")
    @Setter
    @Getter
    private String foodName;

    @JsonProperty("image")
    @Column(name = "image")
    @Setter
    @Getter
    private String image;

    @JsonProperty("measure")
    @Column(name = "measure")
    @Setter
    @Getter
    private String measure;

    @JsonProperty("portion_amount")
    @Column(name = "portion_amount")
    @Setter
    @Getter
    private Short portionAmount;

    @JsonProperty("calories")
    @Column(name = "calories")
    @Setter
    @Getter
    private Short calories;

    @JsonProperty("subgroup_id")
    @Column(name = "subgroup_id")
    @Setter
    @Getter
    private Integer subgroupId;
}
