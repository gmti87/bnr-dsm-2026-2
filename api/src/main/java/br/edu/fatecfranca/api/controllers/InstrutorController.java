
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

import br.edu.fatecfranca.api.models.Instrutor;
import br.edu.fatecfranca.api.services.InstrutorService;

@RestController
@RequestMapping("/instrutores")
public class InstrutorController {

    private final InstrutorService service;

    public InstrutorController(InstrutorService service) {
        this.service = service;
    }

    // Listar todos os instrutores
    @GetMapping
    public List<Instrutor> listarTodos() {
        return service.listarTodos();
    }

    // Buscar instrutor por ID
    @GetMapping("/{id}")
    public Optional<Instrutor> buscarPorId(@PathVariable String id) {
        return service.buscarPorId(id);
    }

    // Cadastrar instrutor
    @PostMapping
    public Instrutor salvar(@RequestBody Instrutor instrutor) {
        return service.salvar(instrutor);
    }

    // Atualizar instrutor
    @PutMapping("/{id}")
    public Instrutor atualizar(
            @PathVariable String id,
            @RequestBody Instrutor instrutor) {

        instrutor.setId(id);
        return service.salvar(instrutor);
    }

    // Excluir instrutor
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable String id) {
        service.excluir(id);
    }
}
