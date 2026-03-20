package com.presupuesto.tfg.controller;

import com.presupuesto.tfg.entity.AreaEntity;
import com.presupuesto.tfg.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/area")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @GetMapping("/lista")
    public List<AreaEntity> findAll(){
        return areaService.findAll();
    }
}
