package com.presupuesto.tfg.service;


import com.presupuesto.tfg.Entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private List<Usuario> usuarios = List.of(
            new Usuario(1, "Alejandro", "Carrasco"),
            new Usuario(2, "Maria", "Lopez")
    );

    public Usuario buscarPorNombreYApellido(String nombre, String apellido) {
        return usuarios.stream()
                .filter(u -> u.getNombre().equalsIgnoreCase(nombre)
                        && u.getApellido().equalsIgnoreCase(apellido))
                .findFirst()
                .orElse(null);
    }
}
