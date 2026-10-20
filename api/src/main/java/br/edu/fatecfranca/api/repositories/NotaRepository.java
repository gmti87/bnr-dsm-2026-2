package br.edu.fatecfranca.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.fatecfranca.api.models.Nota;

public interface NotaRepository extends MongoRepository<Nota, String>{
    
}
