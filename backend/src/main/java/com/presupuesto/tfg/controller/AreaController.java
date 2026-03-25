package com.presupuesto.tfg.controller;

import com.presupuesto.tfg.entity.AreaEntity;
import com.presupuesto.tfg.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/area")
public class AreaController {

    @Autowired
    private AreaService areaService;

    /**
     * Coge todas las areas y las pone en una lista
     *
     * @return lista de {@link AreaEntity}
     */
    @GetMapping("/lista")
    public List<AreaEntity> findAll(){
        return areaService.findAll();
    }
}
