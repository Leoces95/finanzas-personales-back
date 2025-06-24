package com.finanzas.finanzas_personales.service.implementation;

import com.finanzas.finanzas_personales.dtos.GeneralResponseDto;
import com.finanzas.finanzas_personales.jpa.entities.Usuario;
import com.finanzas.finanzas_personales.jpa.repository.UsuarioRepository;
import com.finanzas.finanzas_personales.service.IUsuariosService;
import org.springframework.stereotype.Service;

import java.lang.module.FindException;
import java.util.Optional;

@Service
public class UsuariosService implements IUsuariosService {

    private final UsuarioRepository usuarioRepository;

    public UsuariosService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public GeneralResponseDto obtenerUsuario(Integer usuarioId) throws FindException {
        GeneralResponseDto respuesta =  new GeneralResponseDto();
        Optional<Usuario> usuarioDtoList =  usuarioRepository.findById(usuarioId);
        if(usuarioDtoList.isPresent()){
            respuesta.setSuccess(true);
            respuesta.setMessage("Exitoso");
            respuesta.setSeverity("INFO");
            respuesta.setData(usuarioDtoList);
        }
        respuesta.setSuccess(false);
        respuesta.setMessage("No encontrado");
        respuesta.setSeverity("INFO");
        return  respuesta;
    }
}
