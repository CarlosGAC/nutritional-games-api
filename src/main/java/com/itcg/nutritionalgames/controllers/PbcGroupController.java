package com.itcg.nutritionalgames.controllers;

import com.itcg.nutritionalgames.entities.PbcGroup;
import com.itcg.nutritionalgames.services.PbcGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PbcGroupController {

    @Autowired
    public PbcGroupController(PbcGroupService pbcGroupService) {
        this.pbcGroupService = pbcGroupService;
    }

    private final PbcGroupService pbcGroupService;

    @GetMapping(value = "/v1/pbcGroups")
    public List<PbcGroup> getAllPbcGroups() {

        List<PbcGroup> response = pbcGroupService.findAllPbcGroups();
        return response;
    }

    @GetMapping(value = "/v1/pbcGroups/{name}")
    public PbcGroup getPbcGroupByName(@PathVariable(name = "name") String name) {

        PbcGroup foundPbcGroup = pbcGroupService.findByName(name);
        return foundPbcGroup;
    }

    @GetMapping(value = "/v1/pbcGroups/{pbc_group_id}")
    public PbcGroup getPbcGroupById(@PathVariable(name = "pbc_group_id") Integer pbcGroupId) {

        PbcGroup foundPbcGroup = pbcGroupService.findByPbcGroupId(pbcGroupId);
        return foundPbcGroup;
    }
}
