package com.projeto.projeto.service;

import com.projeto.projeto.entity.ProjetoEntity;
import com.projeto.projeto.repository.ProjetoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetoService {

    private final ProjetoRepository repository;

    public ProjetoService(ProjetoRepository repository) {
        this.repository = repository;
    }

    public ProjetoEntity salvar(ProjetoEntity projeto) {
        return repository.save(projeto);
    }

    public List<ProjetoEntity> listarTodos() {
        return repository.findAll();
    }

    public Optional<ProjetoEntity> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}