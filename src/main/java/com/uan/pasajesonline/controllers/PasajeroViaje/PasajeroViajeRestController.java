package com.uan.pasajesonline.controllers.PasajeroViaje;

import com.uan.pasajesonline.models.entity.Pasajero;
import com.uan.pasajesonline.models.entity.PasajeroViaje;
import com.uan.pasajesonline.models.services.PasajeroViaje.IPasajeroViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PasajeroViajeRestController {

    @Autowired
    private IPasajeroViajeService pasajeroViajeService;

    @GetMapping("/pasajes")
    public List<PasajeroViaje> index() {
        return pasajeroViajeService.findAll();
    }
}
