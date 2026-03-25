package com.presupuesto.tfg.controller;

import com.presupuesto.tfg.entity.ContactoEntity;
import com.presupuesto.tfg.entity.EmpresaEntity;
import com.presupuesto.tfg.service.ContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contacto")
public class ContactoController {

    @Autowired
    private ContactoService contactoService;

    @PostMapping("/lista")
    public List<ContactoEntity> findContactoByEmpresa(@RequestBody EmpresaEntity empresa){
        return contactoService.findContactoByEmpresa(empresa);
    }
}
