package com.finanzas.finanzas_personales.jpa.entities;

import jakarta.persistence.*;

@Entity
public class Categoria {

    @Id
    private Integer categoriaId;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String tipo; // Validar en código si es "Ingreso" o "Gasto"

    // Getters y setters
}
