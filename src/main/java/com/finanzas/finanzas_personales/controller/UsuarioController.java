package com.finanzas.finanzas_personales.controller;

import com.finanzas.finanzas_personales.dtos.GeneralResponseDto;
import com.finanzas.finanzas_personales.service.IUsuariosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuarios")
@RequiredArgsConstructor
public class UsuarioController {
 private final IUsuariosService iUsuariosService;

@GetMapping
        (
                path = "consultarUsuario",
                produces = MediaType.APPLICATION_JSON_VALUE)
public GeneralResponseDto getUsuario(Integer usuarioId){
    return iUsuariosService.obtenerUsuario(usuarioId);
    }
}
