package com.portfolio.delivery_wakanda.usuario.application.api;

import com.portfolio.delivery_wakanda.usuario.domain.Usuario;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuarios")
public interface UsuarioAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    Usuario novoUsuario(@RequestBody @Valid Usuario usuarioRequest);
}
