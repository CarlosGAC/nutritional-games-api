package com.itcg.nutritionalgames.services;

import com.itcg.nutritionalgames.entities.FoodGroup;
import com.itcg.nutritionalgames.entities.FoodSubgroup;
import com.itcg.nutritionalgames.entities.PbcGroup;
import com.itcg.nutritionalgames.exception.EntityNotFoundException;
import com.itcg.nutritionalgames.repositories.FoodGroupRepository;
import com.itcg.nutritionalgames.repositories.FoodSubgroupRepository;
import com.itcg.nutritionalgames.repositories.PbcGroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PbcGroupService {

    private final PbcGroupRepository pbcGroupRepository;

    public List<PbcGroup> findAllPbcGroups() {
        return pbcGroupRepository.findAll();
    }

    public PbcGroup findByName(String name) {
        return pbcGroupRepository.findByName(name)
                .orElseThrow(() -> new EntityNotFoundException("No pbc group could be found with name = " + name));
    }

    public PbcGroup findByPbcGroupId(Integer pbcGroupId) {
        return pbcGroupRepository.findById(pbcGroupId)
                .orElseThrow(() -> new EntityNotFoundException("No pbc group could be found with pbc_group_id = " + pbcGroupId));
    }

}
