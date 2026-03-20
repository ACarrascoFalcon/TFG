package com.presupuesto.tfg.controller;

import com.presupuesto.tfg.entity.EmpresaEntity;
import com.presupuesto.tfg.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping("/lista")
    public List<EmpresaEntity> findAll(){
        return empresaService.findAll();
    }
}
