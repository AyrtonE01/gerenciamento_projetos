package com.projeto.projeto.controller;

import com.projeto.projeto.entity.ProjetoEntity;
import com.projeto.projeto.service.ProjetoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    private final ProjetoService service;

    public ProjetoController(ProjetoService service) {
        this.service = service;
    }

    @PostMapping
    public ProjetoEntity criar(@RequestBody ProjetoEntity projeto) {
        return service.salvar(projeto);
    }

    @GetMapping
    public List<ProjetoEntity> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<ProjetoEntity> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}