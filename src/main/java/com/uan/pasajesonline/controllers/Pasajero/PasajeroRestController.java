package com.uan.pasajesonline.controllers.Pasajero;


import com.uan.pasajesonline.models.entity.Pasajero;
import com.uan.pasajesonline.models.services.Pasajero.IPasajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api")
public class PasajeroRestController {


    @Autowired
    private IPasajeroService pasajeroService;

    @GetMapping("/pasajeros")
    public List<Pasajero> index() {
        return pasajeroService.findAll();
    }

    @GetMapping("/pasajeros/{id}")
    public Pasajero show(@PathVariable Long id) {
        return pasajeroService.findById(id);
    }

    @PostMapping("/pasajeros")
    @ResponseStatus(HttpStatus.CREATED)
    public Pasajero create(@RequestBody Pasajero pasajero) {
        return pasajeroService.save(pasajero);
    }

    @PutMapping("/pasajeros/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Pasajero update(@RequestBody Pasajero pasajero, @PathVariable Long id) {

        Pasajero pasajeroActual = pasajeroService.findById(id);

        pasajeroActual.setNombres(pasajero.getNombres());
        pasajeroActual.setApellidos(pasajero.getApellidos());

        System.out.println("Fecha recibida antes de set: "+pasajero.getFechaDeNacimiento());

        pasajeroActual.setFechaDeNacimiento(pasajero.getFechaDeNacimiento());
        pasajeroActual.setUsername(pasajero.getUsername());
        pasajeroActual.setPassword(pasajero.getPassword());
        return pasajeroService.save(pasajeroActual);
    }

    @DeleteMapping("/pasajeros/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        pasajeroService.delete(id);
    }

}
