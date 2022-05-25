package com.uan.pasajesonline.models.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "viajes")
public class Viaje {
    //ATRIBUTOS
    @Id
    @Column(name = "viaje_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String origen;
    private String destino;
    private double costo;
    @Column(name = "fecha_de_salida")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date fechaDeSalida;
    @Column(name = "hora_de_salida")
    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:MM:SS")
    private Date horaDeSalida;
    @Column(name = "estado_de_viaje")
    private String estadoDeViaje;

    //RELACIONES
    @JsonIgnore
    @OneToMany(mappedBy = "viaje")
    private List<PasajeroViaje> pasajerosViajes = new ArrayList<>();
    @ManyToOne
    private Vehiculo vehiculo;

    //GET Y SET
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Date getFechaDeSalida() {
        return fechaDeSalida;
    }

    public void setFechaDeSalida(Date fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }

    public Date getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(Date horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    public String getEstadoDeViaje() {
        return estadoDeViaje;
    }

    public void setEstadoDeViaje(String estadoDeViaje) {
        this.estadoDeViaje = estadoDeViaje;
    }

    public List<PasajeroViaje> getPasajerosViajes() {
        return pasajerosViajes;
    }

    public void setPasajerosViajes(List<PasajeroViaje> pasajerosViajes) {
        this.pasajerosViajes = pasajerosViajes;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
