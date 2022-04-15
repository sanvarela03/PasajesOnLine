package com.uan.pasajesonline.models.dao;

import com.uan.pasajesonline.models.entity.Pasajero;
import org.springframework.data.repository.CrudRepository;

public interface IPasajeroDao extends CrudRepository<Pasajero, Long> {

}
