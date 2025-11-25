package com.br.senai.infob.atividadeindividual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.senai.infob.atividadeindividual.models.Endereco;



@Repository
public interface  EnderecoRepository  extends JpaRepository<Endereco, Integer>  {

}