package com.itcg.nutritionalgames.repositories;

import com.itcg.nutritionalgames.entities.PbcGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PbcGroupRepository extends JpaRepository<PbcGroup, Integer> {
    List<PbcGroup> findAll();
    Optional<PbcGroup> findByName(String name);
}
