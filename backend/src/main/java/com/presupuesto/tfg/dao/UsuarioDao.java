package com.presupuesto.tfg.dao;


import com.presupuesto.tfg.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDao extends JpaRepository<UsuarioEntity, Integer> {

    /**
     * Busca un {@link UsuarioEntity} por nombre de usuario y contraseña
     *
     * @param nombreUsuario nombre de usuario de {@link UsuarioEntity}
     * @param password contraseña de {@link UsuarioEntity}
     * @return un {@link UsuarioEntity}
     */
    UsuarioEntity findUsuarioByNombreUsuarioAndPassword(String nombreUsuario, String password);
}
