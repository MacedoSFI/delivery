package com.portfolio.delivery_wakanda.usuario.application.service;

import com.portfolio.delivery_wakanda.usuario.application.repository.UsuarioRepository;
import com.portfolio.delivery_wakanda.usuario.domain.Usuario;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    public Usuario criaNovoUsuario(@Valid Usuario usuarioRequest) {
        //credencialService.criaNovaCredencial(usuarioRequest);
        Usuario usuarioResponse = new Usuario(usuarioRequest);//usaria repository?
        return usuarioResponse;
    }
}
