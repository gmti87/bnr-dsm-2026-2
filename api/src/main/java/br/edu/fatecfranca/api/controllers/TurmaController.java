package br.edu.fatecfranca.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.api.models.Turma;
import br.edu.fatecfranca.api.services.TurmaService;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    private final TurmaService service;

    public TurmaController(TurmaService service) {
        this.service = service;
    }

    // Listar todas as turmas
    @GetMapping
    public List<Turma> listarTodos() {
        return service.listarTodos();
    }

    // Buscar turma por ID
    @GetMapping("/{id}")
    public Optional<Turma> buscarPorId(@PathVariable String id) {
        return service.buscarPorId(id);
    }

    // Cadastrar turma
    @PostMapping
    public Turma salvar(@RequestBody Turma turma) {
        return service.salvar(turma);
    }

    // Atualizar turma
    @PutMapping("/{id}")
    public Turma atualizar(
            @PathVariable String id,
            @RequestBody Turma turma) {

        turma.setId(id);
        return service.salvar(turma);
    }

    // Excluir turma
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable String id) {
        service.excluir(id);
    }
}
