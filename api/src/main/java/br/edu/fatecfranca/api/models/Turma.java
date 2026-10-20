package br.edu.fatecfranca.api.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

public class Turma {

    @Id
    private String id;
    
    private String cursoId;
    private String instrutorId;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Integer numVagas;
    private String status;
    
    public Turma() {
    }

    public Turma(
        String id,
        String cursoId,
        String instrutorId,
        LocalDate dataInicio,
        LocalDate dataFim,
        Integer numVagas,
        String status) {
            this.id = id;
            this.cursoId = cursoId;
            this.instrutorId = instrutorId;
            this.dataInicio = dataInicio;
            this.dataFim = dataFim;
            this.numVagas = numVagas;
            this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCursoId() {
        return cursoId;
    }

    public void setCursoId(String cursoId) {
        this.cursoId = cursoId;
    }

    public String getInstrutorId() {
        return instrutorId;
    }

    public void setInstrutorId(String instrutorId) {
        this.instrutorId = instrutorId;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public Integer getNumVagas() {
        return numVagas;
    }

    public void setNumVagas(Integer numVagas) {
        this.numVagas = numVagas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
