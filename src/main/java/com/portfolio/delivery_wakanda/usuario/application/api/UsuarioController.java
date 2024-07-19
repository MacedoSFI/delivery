package com.portfolio.delivery_wakanda.usuario.application.api;

import com.portfolio.delivery_wakanda.usuario.application.service.UsuarioService;
import com.portfolio.delivery_wakanda.usuario.domain.Usuario;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class UsuarioController implements UsuarioAPI {

    private final UsuarioService usuarioService;
    @Override
    public Usuario novoUsuario(@RequestBody Usuario usuarioRequest) {
        Usuario usuarioResponse = usuarioService.criaNovoUsuario(usuarioRequest);
        return usuarioResponse;
    }


    //metodo com @GetMapping retornando um service.metodo()

}
