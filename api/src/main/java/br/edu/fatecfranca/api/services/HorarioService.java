package br.edu.fatecfranca.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.edu.fatecfranca.api.models.Horario;
import br.edu.fatecfranca.api.repositories.HorarioRepository;

@Service 
public class HorarioService {

    private final HorarioRepository repository;

    public HorarioService(HorarioRepository repository) {
        this.repository = repository;
    }

    public Horario salvar(Horario horario) {
        return repository.save(horario);
    }

    public List<Horario> listarTodos() {
        return repository.findAll();
    }

    public Optional<Horario> buscarPorId(String id) {
        return repository.findById(id);
    }

    public void excluir(String id) {
        repository.deleteById(id);
    }
}
