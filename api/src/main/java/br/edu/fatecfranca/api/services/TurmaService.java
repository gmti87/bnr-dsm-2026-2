package br.edu.fatecfranca.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.edu.fatecfranca.api.models.Turma;
import br.edu.fatecfranca.api.repositories.TurmaRepository;

@Service
public class TurmaService {
    private final TurmaRepository repository;

    // Construtor para injeção de dependência
    public TurmaService(TurmaRepository repository) {
        this.repository = repository;
    }

    // Cadastrar ou atualizar turma
    public Turma salvar(Turma turma) {
        return repository.save(turma);
    }

    // Listar todas as turmas
    public List<Turma> listarTodos() {
        return repository.findAll();
    }

    // Buscar turma por ID
    public Optional<Turma> buscarPorId(String id) {
        return repository.findById(id);
    }

    // Excluir turma por ID
    public void excluir(String id) {
        repository.deleteById(id);
    }
}
