package com.uan.pasajesonline.models.services.Vehiculo;

import com.uan.pasajesonline.models.entity.Pasajero;
import com.uan.pasajesonline.models.entity.Vehiculo;

import java.util.List;

public interface IVehiculoService {

    public List<Vehiculo> findAll();
}
