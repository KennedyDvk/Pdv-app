package br.com.arena.pdv_app.domain.relatorio;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RelatorioRepository extends MongoRepository<Relatorio, String> {
}
