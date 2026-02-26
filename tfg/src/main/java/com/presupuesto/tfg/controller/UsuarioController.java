package com.presupuesto.tfg.controller;


import com.presupuesto.tfg.entity.UsuarioEntity;
import com.presupuesto.tfg.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    private UsuarioService service;

    @PostMapping("/login")
    public UsuarioEntity login(@RequestBody UsuarioEntity usuario) {

        return service.findUsuarioByNombreUsuarioAndPassword(usuario.getNombreUsuario(), usuario.getPassword());
    }
}