package com.uan.pasajesonline.controllers.Pasajero;


import com.uan.pasajesonline.models.entity.Pasajero;
import com.uan.pasajesonline.models.services.Pasajero.IPasajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PasajeroRestController {


    @Autowired
    private IPasajeroService pasajeroService;

    @GetMapping("/pasajeros")
    public List<Pasajero> index() {

        return pasajeroService.findAll();
    }
}
