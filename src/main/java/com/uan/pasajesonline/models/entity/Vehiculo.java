package com.uan.pasajesonline.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "vehiculos")
public class Vehiculo {
    //ATRIBUTOS
    @Id
    @Column(name = "vehiculo_id")
    private Long id;
    private String descripcion;
    private String matricula;
    @Column(name = "cantidad_de_sillas")
    private int cantidadDeSillas;

    //RELACIONES
    @JsonIgnore
    @OneToMany(mappedBy = "vehiculo")
    private List<Viaje> viajes = new ArrayList<>();

    //GET Y SET
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCantidadDeSillas() {
        return cantidadDeSillas;
    }

    public void setCantidadDeSillas(int cantidadDeSillas) {
        this.cantidadDeSillas = cantidadDeSillas;
    }

    public List<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(List<Viaje> viajes) {
        this.viajes = viajes;
    }
}
