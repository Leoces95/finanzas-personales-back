package com.finanzas.finanzas_personales.jpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "Usuarios")
public class Usuario {

    @Id
    @Column(name = "UsuarioId")
    private Integer usuarioId;

    @Column(
            name = "Nombre",
            nullable = false)
    private String nombre;

    @Column(
            name ="FechaRegistro" ,
            nullable = false)
    private LocalDateTime fechaRegistro = LocalDateTime.now();

    public Usuario() {}

    public Usuario(Integer usuarioId, String nombre, LocalDateTime fechaRegistro) {
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.fechaRegistro = fechaRegistro;
    }
}
