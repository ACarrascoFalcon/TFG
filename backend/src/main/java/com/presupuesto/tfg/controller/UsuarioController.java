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
     * @param nombreUsuario nombre del {@link UsuarioEntity}
     * @param password contraseña del {@link UsuarioEntity}
     * @return {@link UsuarioEntity}
     */
    @PostMapping("/login")
    public UsuarioEntity login(@RequestBody String nombreUsuario, @RequestBody String password) {
        return service.findUsuarioByNombreUsuarioAndPassword(nombreUsuario, password);
    }
}