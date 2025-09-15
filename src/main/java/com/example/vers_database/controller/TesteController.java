package com.example.vers_database.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import com.example.vers_database.model.Teste;
import com.example.vers_database.repository.TesteRepository;

@RestController
@RequestMapping("/testes")
public class TesteController {

    private final TesteRepository repository;

    public TesteController(TesteRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Teste criar(@RequestBody Teste teste) {
        return repository.save(teste);
    }

    @GetMapping
    public List<Teste> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Teste> buscar(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PutMapping("/{id}")
    public Teste atualizar(@PathVariable Long id, @RequestBody Teste novoTeste) {
        return repository.findById(id).map(teste -> {
            teste.setDataRealizado(novoTeste.getDataRealizado());
            teste.setSatisfatoriedade(novoTeste.getSatisfatoriedade());
            teste.setNumeroPiezos(novoTeste.getNumeroPiezos());
            return repository.save(teste);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
