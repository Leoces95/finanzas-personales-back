package com.finanzas.finanzas_personales.jpa.entities;

import jakarta.persistence.*;

@Entity
public class Credencial {

    @Id
    private Integer usuarioId;

    @Column(nullable = false, unique = true)
    private String correo;

    @Column(nullable = false)
    private String contrasena;

    @OneToOne
    @JoinColumn(name = "usuarioId", referencedColumnName = "usuarioId")
    private Usuario usuario;
}
