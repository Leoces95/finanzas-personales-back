package com.finanzas.finanzas_personales.jpa.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Transaccion {

    @Id
    private Integer transaccionId;

    @Column(nullable = false)
    private BigDecimal monto;

    private String descripcion;

    @Column(nullable = false)
    private LocalDate fechaTransaccion;

    @ManyToOne
    @JoinColumn(name = "usuarioId", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "categoriaId", nullable = false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "cuentaId", nullable = false)
    private Cuenta cuenta;

}
