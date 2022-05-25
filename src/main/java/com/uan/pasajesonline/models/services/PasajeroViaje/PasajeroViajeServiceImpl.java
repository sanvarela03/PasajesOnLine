package com.uan.pasajesonline.models.services.PasajeroViaje;

import com.uan.pasajesonline.models.dao.PasajeroViaje.IPasajeroViajeDao;
import com.uan.pasajesonline.models.entity.PasajeroViaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasajeroViajeServiceImpl implements IPasajeroViajeService {

    @Autowired
    private IPasajeroViajeDao dao;

    @Override
    public List<PasajeroViaje> findAll() {
        return (List<PasajeroViaje>) dao.findAll();
    }
}
