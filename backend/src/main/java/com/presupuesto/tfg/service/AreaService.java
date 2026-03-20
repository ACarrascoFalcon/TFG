package com.presupuesto.tfg.service;

import com.presupuesto.tfg.dao.AreaDao;
import com.presupuesto.tfg.entity.AreaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaService {

    @Autowired
    private AreaDao areaDao;

    public List<AreaEntity> findAll(){
        return areaDao.findAll();
    }

}
