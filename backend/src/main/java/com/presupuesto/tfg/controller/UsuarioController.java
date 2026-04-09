package com.presupuesto.tfg.controller;


import com.presupuesto.tfg.entity.UsuarioEntity;
import com.presupuesto.tfg.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    /**
     * Recibe las credenciales del {@link UsuarioEntity}
     *
     * @param usuarioEntity 
     * @return {@link UsuarioEntity}
     */
    @PostMapping("/login")
    public UsuarioEntity login(@RequestBody UsuarioEntity usuarioEntity) {
        return service.findUsuarioByNombreUsuarioAndPassword(usuarioEntity.getNombreUsuario(), usuarioEntity.getPassword());
    }
}