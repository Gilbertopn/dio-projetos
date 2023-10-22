package com.gilbertoproject.padraoDeProjeto.service;

import com.gilbertoproject.padraoDeProjeto.model.Pessoa;
import com.gilbertoproject.padraoDeProjeto.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa criarPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public Pessoa getPessoaPorId(Long id) {
        return pessoaRepository.findById(id).orElse(null);
    }
}

