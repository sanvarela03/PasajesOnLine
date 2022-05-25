package com.uan.pasajesonline.models.services.Vehiculo;

import com.uan.pasajesonline.models.dao.Vehiculo.IVehiculoDao;
import com.uan.pasajesonline.models.entity.Pasajero;
import com.uan.pasajesonline.models.entity.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

    @Autowired
    private IVehiculoDao dao;

    @Override
    public List<Vehiculo> findAll() {
        return (List<Vehiculo>) dao.findAll();
    }
}
