package br.edu.fatecfranca.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.fatecfranca.api.models.Horario;

public interface HorarioRepository extends MongoRepository <Horario, String> {
    
}
