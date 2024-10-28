package br.com.arena.pdv_app.domain.mesa;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MesaRepository extends MongoRepository<Mesa, String> {
}
