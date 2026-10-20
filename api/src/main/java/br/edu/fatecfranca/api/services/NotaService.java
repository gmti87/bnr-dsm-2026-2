package br.edu.fatecfranca.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.edu.fatecfranca.api.models.Nota;
import br.edu.fatecfranca.api.repositories.NotaRepository;

@Service 
public class NotaService {
    
    private final NotaRepository repository;

    public NotaService(NotaRepository repository) {
        this.repository = repository;
    }

    // Cadastrar ou atualizar nota
    public Nota salvar(Nota nota) {
        return repository.save(nota);
    }

    // Listar todas as notas
    public List<Nota> listarTodos() {
        return repository.findAll();
    }

    // Buscar nota por ID
    public Optional<Nota> buscarPorId(String id) {
        return repository.findById(id);
    }

    // Excluir nota por ID
    public void excluir(String id) {
        repository.deleteById(id);
    }

}
