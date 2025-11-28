package com.br.senai.infob.atividadeindividual.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.br.senai.infob.atividadeindividual.models.Endereco;
import com.br.senai.infob.atividadeindividual.services.EnderecoService;




@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    public EnderecoService enderecoService;

    @PostMapping("/salvar")
    public Endereco salvar(@RequestBody Endereco endereco) {
        return enderecoService.salvar(endereco);
    }

}