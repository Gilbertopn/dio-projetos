package com.gilbertoproject.padraoDeProjeto.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String cnpj;
    private String tipo;


}