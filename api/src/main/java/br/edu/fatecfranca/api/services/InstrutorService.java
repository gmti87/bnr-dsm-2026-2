package br.edu.fatecfranca.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.edu.fatecfranca.api.models.Instrutor;
import br.edu.fatecfranca.api.repositories.InstrutorRepository;

@Service
public class InstrutorService {

    private final InstrutorRepository repository;

    // Construtor para injetar o repository
    public InstrutorService(InstrutorRepository repository) {
        this.repository = repository;
    }

    // Cadastrar ou atualizar instrutor
    public Instrutor salvar(Instrutor instrutor) {
        return repository.save(instrutor);
    }

    // Listar todos os instrutores
    public List<Instrutor> listarTodos() {
        return repository.findAll();
    }

    // Buscar instrutor por ID
    public Optional<Instrutor> buscarPorId(String id) {
        return repository.findById(id);
    }

    // Excluir instrutor por ID
    public void excluir(String id) {
        repository.deleteById(id);
    }
}