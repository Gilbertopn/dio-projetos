package com.gilbertoproject.padraoDeProjeto.repository;

import com.gilbertoproject.padraoDeProjeto.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
