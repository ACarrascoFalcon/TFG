package com.presupuesto.tfg.dao;

import com.presupuesto.tfg.entity.AreaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AreaDao extends JpaRepository <AreaEntity, Integer> {

}
