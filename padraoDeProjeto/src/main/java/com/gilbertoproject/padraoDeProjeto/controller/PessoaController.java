package com.gilbertoproject.padraoDeProjeto.controller;

import com.gilbertoproject.padraoDeProjeto.adapter.PessoaAdapterImpl;
import com.gilbertoproject.padraoDeProjeto.adapter.interfaces.PessoaAdapter;
import com.gilbertoproject.padraoDeProjeto.model.Pessoa;
import com.gilbertoproject.padraoDeProjeto.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping("/criar")
    public ResponseEntity<Pessoa> criarPessoa(@RequestBody Pessoa pessoa) {
        if ("Física".equals(pessoa.getTipo())) {
            pessoa.setCnpj(null); // Certifique-se de que apenas um dos campos esteja preenchido
        } else if ("Jurídica".equals(pessoa.getTipo())) {
            pessoa.setCpf(null); // Certifique-se de que apenas um dos campos esteja preenchido
        } else {
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }

        Pessoa pessoaSalva = pessoaService.criarPessoa(pessoa);
        return ResponseEntity.ok(pessoaSalva);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getPessoaRegistro(@PathVariable Long id, @RequestParam String tipoRegistro) {
        Pessoa pessoa = pessoaService.getPessoaPorId(id);

        if (pessoa != null) {
            PessoaAdapter adapter = new PessoaAdapterImpl(pessoa);

            if ("CPF".equals(tipoRegistro)) {
                return ResponseEntity.ok("Registro: " + adapter.getCpf());
            } else if ("CNPJ".equals(tipoRegistro)) {
                return ResponseEntity.ok("Registro: " + adapter.getCnpj());
            } else {
                return ResponseEntity.badRequest().body("Tipo de registro inválido.");
            }
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

