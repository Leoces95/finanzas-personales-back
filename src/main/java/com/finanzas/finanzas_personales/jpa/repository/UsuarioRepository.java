package com.finanzas.finanzas_personales.jpa.repository;

import com.finanzas.finanzas_personales.jpa.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
