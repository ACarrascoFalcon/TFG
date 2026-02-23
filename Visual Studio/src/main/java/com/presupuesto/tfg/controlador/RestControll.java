package com.presupuesto.tfg.controlador;

import com.presupuesto.tfg.Entity.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class RestControll {

    @GetMapping("/details")
    public Map<String, Object> foo(){

        Map <String, Object> json = new HashMap<>();

        Usuario usuario = new Usuario(1, "Alejandro", "Carrasco");
        json.put("nombre", usuario.getNombre());
        json.put("apellido", usuario.getApellido());

        return json;

    }
}
