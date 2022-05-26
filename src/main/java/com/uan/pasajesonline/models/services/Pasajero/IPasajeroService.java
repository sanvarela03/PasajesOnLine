package com.uan.pasajesonline.models.services.Pasajero;

import com.uan.pasajesonline.models.entity.Pasajero;

import java.util.List;

public interface IPasajeroService {

    public List<Pasajero> findAll();

    public Pasajero findById(Long id);

    public Pasajero save(Pasajero pasajero);

    public void delete(Long id);
}
