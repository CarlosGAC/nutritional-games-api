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
@Table(name = "food_subgroup")
public class FoodSubgroup {

    @Id
    @Column(name = "subgroup_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("subgroup_id")
    @Setter
    @Getter
    private Integer subgroupId;

    @JsonProperty("name")
    @Column(name = "name")
    @Setter
    @Getter
    private String name;

    @JsonProperty("group_id")
    @Column(name = "group_id")
    @Setter
    @Getter
    private Integer groupId;

}
