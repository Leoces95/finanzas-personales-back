package com.finanzas.finanzas_personales.service;

import com.finanzas.finanzas_personales.dtos.GeneralResponseDto;

import java.lang.module.FindException;

public interface IUsuariosService {

    GeneralResponseDto obtenerUsuario(Integer usuarioId) throws FindException;
}
