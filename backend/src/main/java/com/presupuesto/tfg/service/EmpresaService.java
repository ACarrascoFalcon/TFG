package com.presupuesto.tfg.service;

import com.presupuesto.tfg.dao.EmpresaDao;
import com.presupuesto.tfg.entity.EmpresaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaDao empresaDao;

    /**
     * Busca las {@link EmpresaEntity} y las mete en una lista
     *
     * @return lista con las {@link EmpresaEntity}
     */
    @Transactional(readOnly = true)
    public List<EmpresaEntity> findAll(){
        return empresaDao.findAll();
    }
}
