package com.uan.pasajesonline.models.entity;


import javax.persistence.*;

@Entity
@Table(name = "pasajeros_viajes")
public class PasajeroViaje {
    //ATRIBUTOS
    @Id
    @Column(name = "pasajero_viaje_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "cantidad_de_asientos")
    private int cantidadDeAsientos;
    @Column(name = "estado_de_pasaje")
    private String estadoDePasaje;

    //RELACIONES
    @ManyToOne
    @JoinColumn(name = "pasajero_id")
    private Pasajero pasajero;
    @ManyToOne
    @JoinColumn(name = "viaje_id")
    private Viaje viaje;

    //GET Y SET
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }

    public void setCantidadDeAsientos(int cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    public String getEstadoDePasaje() {
        return estadoDePasaje;
    }

    public void setEstadoDePasaje(String estadoDelPasaje) {
        this.estadoDePasaje = estadoDelPasaje;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }
}
