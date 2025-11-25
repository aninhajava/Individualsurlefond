package com.br.senai.infob.atividadeindividual.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.senai.infob.atividadeindividual.models.Endereco;
import com.br.senai.infob.atividadeindividual.services.EnderecoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;



@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    public EnderecoService enderecoService;

    @PostMapping("/salvar")
    public Endereco salvar(@RequestBody Endereco endereco) {
        return enderecoService.salvar(endereco);
    }
    
    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Integer id) {
        Boolean deletou = enderecoService.delete(id);
        if (deletou) {
            return "Usuário removido com sucesso";
        }
        return "Falha ao remover o usuário";
    }

}