package br.edu.fatecfranca.api.models;

import org.springframework.data.annotation.Id;

public class Matricula {

    @Id
    private String id;
    
    private String alunoId;
    private String turmaId;
    private String status; 
    
    public Matricula() {

    }

    public Matricula(
        String id,
        String alunoId,
        String turmaId,
        String status) {
            this.id = id;
            this.alunoId = alunoId;
            this.turmaId = turmaId;
            this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(String alunoId) {
        this.alunoId = alunoId;
    }

    public String getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(String turmaId) {
        this.turmaId = turmaId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
