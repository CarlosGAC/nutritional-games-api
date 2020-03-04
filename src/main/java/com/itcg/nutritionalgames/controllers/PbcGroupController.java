package com.itcg.nutritionalgames.controllers;

import com.itcg.nutritionalgames.entities.PbcGroup;
import com.itcg.nutritionalgames.services.PbcGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
        return pbcGroupService.findAllPbcGroups();
    }

    @GetMapping(value = "/v1/pbcGroups", params = "name")
    public PbcGroup findPbcGroupByName(@RequestParam(value = "name") String name) {
        return pbcGroupService.findByName(name);
    }

    @GetMapping(value = "/v1/pbcGroups/{pbc_group_id}")
    public PbcGroup getPbcGroupById(@PathVariable(name = "pbc_group_id") Integer pbcGroupId) {
        return pbcGroupService.findByPbcGroupId(pbcGroupId);
    }
}
