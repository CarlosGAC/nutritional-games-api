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
@Table(name = "pbc_group")
public class PbcGroup {

    @Id
    @Column(name = "pbc_group_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("pbc_group_id")
    @Setter
    @Getter
    private Integer pbcGroupId;

    @JsonProperty("name")
    @Column(name = "name")
    @Setter
    @Getter
    private String name;
}