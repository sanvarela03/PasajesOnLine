package com.uan.pasajesonline.controllers.Viaje;

import com.uan.pasajesonline.models.entity.Viaje;
import com.uan.pasajesonline.models.services.Viaje.IViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ViajeRestController {

    @Autowired
    private IViajeService viajeService;

    @GetMapping("/viajes")
    public List<Viaje> index() {
        return viajeService.findAll();
    }
}
