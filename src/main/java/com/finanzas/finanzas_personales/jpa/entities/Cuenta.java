package com.finanzas.finanzas_personales.jpa.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class Cuenta {

    @Id
    private Integer cuentaId;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private BigDecimal saldoInicial;

    @ManyToOne
    @JoinColumn(name = "usuarioId", nullable = false)
    private Usuario usuario;

}
