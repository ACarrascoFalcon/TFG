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

    /**
     * Busca los {@link ContactoEntity} de {@link EmpresaEntity} y los mete en una lista
     *
     * @param empresa de la que se buscan los contactos
     * @return lista de {@link ContactoEntity}
     */
    @Transactional(readOnly = true)
    public List<ContactoEntity> findContactoByEmpresa (EmpresaEntity empresa){
        return contactoDao.findContactoByEmpresa(empresa);
    }
}
