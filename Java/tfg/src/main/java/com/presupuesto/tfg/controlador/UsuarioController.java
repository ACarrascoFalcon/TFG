package com.presupuesto.tfg.controlador;

import com.presupuesto.tfg.Entity.Usuario;
import com.presupuesto.tfg.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @PostMapping("/buscar")
    public Usuario buscar(@RequestBody Usuario usuario) {
        return service.buscarPorNombreYApellido(
                usuario.getNombre(),
                usuario.getApellido()
        );
    }
}