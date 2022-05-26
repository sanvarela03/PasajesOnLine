package com.uan.pasajesonline.models.services.Pasajero;

import com.uan.pasajesonline.models.dao.Pasajero.IPasajeroDao;
import com.uan.pasajesonline.models.entity.Pasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PasajeroServiceImpl implements IPasajeroService {

    @Autowired
    private IPasajeroDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<Pasajero> findAll() {
        return (List<Pasajero>) dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Pasajero findById(Long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Pasajero save(Pasajero pasajero) {
        return dao.save(pasajero);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        dao.deleteById(id);
    }
}
