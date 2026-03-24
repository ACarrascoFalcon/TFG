package com.presupuesto.tfg.service;

import com.presupuesto.tfg.dao.AreaDao;
import com.presupuesto.tfg.entity.AreaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AreaService {

    @Autowired
    private AreaDao areaDao;

    /**
     * Coge todas las areas y las pone en una lista
     *
     * @return lista de {@link AreaEntity}
     */
    @Transactional(readOnly = true)
    public List<AreaEntity> findAll(){
        return areaDao.findAll();
    }

}
