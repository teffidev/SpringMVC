package com.springMVC.services;

import com.springMVC.model.Usuario;

public class UsuarioService {

    public Usuario crearUsuario () {
        Usuario usuario = new Usuario("Diego", 32);

        return usuario;
    }

}
