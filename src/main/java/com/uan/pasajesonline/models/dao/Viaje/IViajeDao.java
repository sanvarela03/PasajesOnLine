package com.uan.pasajesonline.models.dao.Viaje;

import com.uan.pasajesonline.models.entity.Vehiculo;
import com.uan.pasajesonline.models.entity.Viaje;
import org.springframework.data.repository.CrudRepository;

public interface IViajeDao extends CrudRepository<Viaje, Long> {
}
