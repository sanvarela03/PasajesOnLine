package com.uan.pasajesonline.models.services;

import com.uan.pasajesonline.models.dao.IPasajeroDao;
import com.uan.pasajesonline.models.entity.Pasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PasajeroServiceImpl implements IPasajeroService{

    @Autowired
    private IPasajeroDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<Pasajero> findAll() {
        return (List<Pasajero>) dao.findAll();
    }
}
