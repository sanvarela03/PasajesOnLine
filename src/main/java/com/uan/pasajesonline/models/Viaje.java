package com.uan.pasajesonline.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="viajes")
public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long viajeID;
    private String Matricula;
    private String Descripcion;
    private Integer cant_sillas;

    public Long getID_Vehiculo() {
        return viajeID;
    }

    public void setID_Vehiculo(Long ID_Vehiculo) {
        this.viajeID = ID_Vehiculo;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Integer getCant_sillas() {
        return cant_sillas;
    }

    public void setCant_sillas(Integer cant_sillas) {
        this.cant_sillas = cant_sillas;
    }
}
