package com.br.senai.infob.atividadeindividual.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.br.senai.infob.atividadeindividual.models.Usuario;
import com.br.senai.infob.atividadeindividual.services.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    public UsuarioService usuarioService;
    
    
    @PostMapping("/login")
    public Usuario login(@RequestParam String email,@RequestParam String senha) {
        return usuarioService.login(email, senha);
    }

    
    @PostMapping("/cadastro")
    public Usuario cadastro(@RequestBody Usuario usuario, @RequestParam String senha, @RequestParam String confirmarSenha) {
        return usuarioService.cadastrarUsuario(usuario, senha, confirmarSenha);
    }

    @GetMapping("/buscar/{id}")
    public Usuario buscarPorId(@PathVariable Integer id) {
        return usuarioService.buscarPorId(id)
        ;
    }
    

}


