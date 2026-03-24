package com.presupuesto.tfg.service;


import com.presupuesto.tfg.dao.UsuarioDao;
import com.presupuesto.tfg.entity.UsuarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioDao usuarioDao;

    /**
     * Busca un {@link UsuarioEntity} por nombre de usuario y contraseña
     *
     * @param nombreUsuario nombre de usuario de {@link UsuarioEntity}
     * @param password contraseña de {@link UsuarioEntity}
     * @return un {@link UsuarioEntity}
     */
    @Transactional(readOnly = true)
    public UsuarioEntity findUsuarioByNombreUsuarioAndPassword(String nombreUsuario, String password) {
        return usuarioDao.findUsuarioByNombreUsuarioAndPassword(nombreUsuario, password);
    }
}
