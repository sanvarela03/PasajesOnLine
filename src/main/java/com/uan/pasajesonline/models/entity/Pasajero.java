package com.uan.pasajesonline.models.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity(name = "pasajeros")
public class Pasajero {

    //ATRIBUTOS
    @Id
    @Column(name = "pasajero_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    private String apellidos;


    @Column(name = "fecha_de_nacimiento")
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "UTC-05")
    private Date fechaDeNacimiento;
    private String username;
    private String password;

    //RELACIONES
    @JsonIgnore
    @OneToMany(mappedBy = "pasajero")
    private List<PasajeroViaje> pasajerosViajes = new ArrayList<>();

    // GET Y SET
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<PasajeroViaje> getPasajerosViajes() {
        return pasajerosViajes;
    }

    public void setPasajerosViajes(List<PasajeroViaje> pasajerosViajes) {
        this.pasajerosViajes = pasajerosViajes;
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", pasajerosViajes=" + pasajerosViajes +
                '}';
    }
}
