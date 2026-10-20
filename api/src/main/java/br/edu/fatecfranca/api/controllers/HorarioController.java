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

import br.edu.fatecfranca.api.models.Horario;
import br.edu.fatecfranca.api.services.HorarioService;

@RestController
@RequestMapping("/horarios")
public class HorarioController {

    private final HorarioService service;

    public HorarioController(HorarioService service) {
        this.service = service;
    }

    // Listar todos os horários
    @GetMapping
    public List<Horario> listarTodos() {
        return service.listarTodos();
    }

    // Buscar horário por ID
    @GetMapping("/{id}")
    public Optional<Horario> buscarPorId(@PathVariable String id) {
        return service.buscarPorId(id);
    }

    // Cadastrar horário
    @PostMapping
    public Horario salvar(@RequestBody Horario horario) {
        return service.salvar(horario);
    }

    // Atualizar horário
    @PutMapping("/{id}")
    public Horario atualizar(
            @PathVariable String id,
            @RequestBody Horario horario) {

        //horario.setId(id);
        return service.salvar(horario);
    }

    // Excluir horário
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable String id) {
        service.excluir(id);
    }
}
