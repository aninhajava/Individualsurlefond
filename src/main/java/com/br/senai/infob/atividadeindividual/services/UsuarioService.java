package com.br.senai.infob.atividadeindividual.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.senai.infob.atividadeindividual.models.Usuario;
import com.br.senai.infob.atividadeindividual.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

 
    public Usuario cadastrarUsuario(Usuario usuario, String senha, String confirmarSenha) {
        if (!senha.equals(confirmarSenha)) {
            return null;
        }

        usuarioRepository.save(usuario);
        return usuario;
    }

    public Usuario login(String email, String senha) {
        Usuario usuario = usuarioRepository.findByEmail(email);

        if (usuario == null) {
            System.out.println("Usuário não encontrado!");
            return null;
        }

        if (!usuario.getSenha().equals(senha)) {
            System.out.println("Senha incorreta!");
            return null;
        }

        return usuario;
    }
    
        public Usuario buscarPorId(Integer id) {
        return usuarioRepository.findById(id).get();
    }
}