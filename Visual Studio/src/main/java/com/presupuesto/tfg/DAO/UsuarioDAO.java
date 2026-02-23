package com.presupuesto.tfg.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class UsuarioDAO {

    @PersistenceContext
    private EntityManager em;

//    public Usuario buscar(String nombre, String apellido) {
//        return em.createQuery(
//                        "SELECT u FROM Usuario u WHERE u.nombre = :nombre AND u.apellido = :apellido",
//                        Usuario.class)
//                .setParameter("nombre", nombre)
//                .setParameter("apellido", apellido)
//                .getSingleResult();
//    }
}
