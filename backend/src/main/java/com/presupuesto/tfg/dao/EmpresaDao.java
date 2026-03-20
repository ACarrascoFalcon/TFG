package com.presupuesto.tfg.dao;

import com.presupuesto.tfg.entity.EmpresaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaDao extends JpaRepository <EmpresaEntity, Integer> {
}
