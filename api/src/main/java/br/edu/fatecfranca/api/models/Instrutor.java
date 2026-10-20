package br.edu.fatecfranca.api.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "instrutor")
public class Instrutor {

    @Id
    private String id;

    private String nome;
    private String cep;
    private String cpf;
    private String email;
    private Double valorHoraAula;

    private List<String> especialidades;

    public Instrutor() {
    }

    public Instrutor(
            String id,
            String nome,
            String cep,
            String cpf,
            String email,
            Double valorHoraAula,
            List<String> especialidades) {

        this.id = id;
        this.nome = nome;
        this.cep = cep;
        this.cpf = cpf;
        this.email = email;
        this.valorHoraAula = valorHoraAula;
        this.especialidades = especialidades;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    public List<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<String> especialidades) {
        this.especialidades = especialidades;
    }
}