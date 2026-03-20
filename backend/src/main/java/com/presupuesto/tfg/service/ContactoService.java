package com.presupuesto.tfg.service;

import com.presupuesto.tfg.dao.ContactoDao;
import com.presupuesto.tfg.entity.ContactoEntity;
import com.presupuesto.tfg.entity.EmpresaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ContactoService {

    @Autowired
    private ContactoDao contactoDao;

    @Transactional(readOnly = true)
    public List<ContactoEntity> findContactoByEmpresa (EmpresaEntity empresa){
        return contactoDao.findContactoByEmpresa(empresa);
    }
}
