package com.gilbertoproject.padraoDeProjeto.adapter;

import com.gilbertoproject.padraoDeProjeto.adapter.interfaces.PessoaAdapter;
import com.gilbertoproject.padraoDeProjeto.model.Pessoa;

public class PessoaAdapterImpl implements PessoaAdapter {

    private final Pessoa pessoaEntity;

    public PessoaAdapterImpl(Pessoa pessoaEntity) {
        this.pessoaEntity = pessoaEntity;
    }

    @Override
    public String getCpf() {
        return pessoaEntity.getCpf();
    }

    @Override
    public String getCnpj() {
        return pessoaEntity.getCnpj();
    }
}

