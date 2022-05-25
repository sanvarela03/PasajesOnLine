package com.uan.pasajesonline.controllers.Vehiculo;

import com.uan.pasajesonline.models.entity.PasajeroViaje;
import com.uan.pasajesonline.models.entity.Vehiculo;
import com.uan.pasajesonline.models.services.Vehiculo.IVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VehiculoRestController {

    @Autowired
    private IVehiculoService vehiculoService;

    @GetMapping("/vehiculos")
    public List<Vehiculo> index() {
        return vehiculoService.findAll();
    }

}
