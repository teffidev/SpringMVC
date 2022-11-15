package com.springMVC.controller;
import com.springMVC.model.Usuario;
import com.springMVC.services.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UsuarioController {

    private UsuarioService usuarioService = new UsuarioService();

    @GetMapping("/")
    public Usuario crearUsuario () {
        return usuarioService.crearUsuario();
    }

    @GetMapping("crear2")
    public Usuario crearUsuario2 () {
        Usuario usuario = new Usuario("Alicia", 45);
        return usuario;
    }

}
