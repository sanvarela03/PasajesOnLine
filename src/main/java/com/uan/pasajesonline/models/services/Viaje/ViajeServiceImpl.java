package com.uan.pasajesonline.models.services.Viaje;

import com.uan.pasajesonline.models.dao.Viaje.IViajeDao;
import com.uan.pasajesonline.models.entity.Viaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViajeServiceImpl implements IViajeService {

    @Autowired
    private IViajeDao dao;

    @Override
    public List<Viaje> findAll() {
        return (List<Viaje>) dao.findAll();
    }
}
