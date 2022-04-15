package com.uan.pasajesonline.models.services;

import com.uan.pasajesonline.models.entity.Pasajero;

import java.util.List;

public interface IPasajeroService {

    public List<Pasajero> findAll();
}
