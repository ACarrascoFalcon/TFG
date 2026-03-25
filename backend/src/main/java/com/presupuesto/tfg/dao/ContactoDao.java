package com.presupuesto.tfg.dao;

import com.presupuesto.tfg.entity.ContactoEntity;
import com.presupuesto.tfg.entity.EmpresaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactoDao extends JpaRepository<ContactoEntity, Integer> {

    /**
     * Busca los {@link ContactoEntity} que tiene {@link EmpresaEntity}
     *
     * @param empresa de la que se buscan los contactos
     * @return lista de {@link ContactoEntity}
     */
    List<ContactoEntity> findContactoByEmpresa(EmpresaEntity empresa);
}
