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

import br.edu.fatecfranca.api.models.Nota;
import br.edu.fatecfranca.api.services.NotaService;

@RestController
@RequestMapping("/notas")
public class NotaController {

    private final NotaService service;

    public NotaController(NotaService service) {
        this.service = service;
    }

    // Listar todas as notas
    @GetMapping
    public List<Nota> listarTodos() {
        return service.listarTodos();
    }

    // Buscar nota por ID
    @GetMapping("/{id}")
    public Optional<Nota> buscarPorId(@PathVariable String id) {
        return service.buscarPorId(id);
    }

    // Cadastrar nota
    @PostMapping
    public Nota salvar(@RequestBody Nota nota) {
        return service.salvar(nota);
    }

    // Atualizar nota
    @PutMapping("/{id}")
    public Nota atualizar(
            @PathVariable String id,
            @RequestBody Nota nota) {

        //nota.setId(id);
        return service.salvar(nota);
    }

    // Excluir nota
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable String id) {
        service.excluir(id);
    }
}
