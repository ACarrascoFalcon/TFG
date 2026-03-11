package com.presupuesto.tfg.dao;


import com.presupuesto.tfg.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDao extends JpaRepository<UsuarioEntity, Integer> {

    UsuarioEntity findUsuarioByNombreUsuarioAndPassword(String nombreUsuario, String password);
}
