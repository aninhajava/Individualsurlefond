package com.br.senai.infob.atividadeindividual.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.senai.infob.atividadeindividual.models.Endereco;
import com.br.senai.infob.atividadeindividual.repositories.EnderecoRepository;

@Service
public class EnderecoService {
    
    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco salvar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public Boolean  delete(Integer id) {
        Endereco endereco = enderecoRepository.findById(id).get();
        if(endereco != null) {
            enderecoRepository.deleteById(id);
            return true;
        }
        return false;
    }

}