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
@Table(name = "daily_portion")
public class DailyPortion {

    @Id
    @Column(name = "daily_portion_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("daily_portion_id")
    @Setter
    @Getter
    private Integer dailyPortionId;

    @Column(name = "amount")
    @JsonProperty("amount")
    private Short amount;

    @Column(name = "pbc_group_id")
    @JsonProperty("pbc_group_id")
    private Integer pbcGroupId;
}