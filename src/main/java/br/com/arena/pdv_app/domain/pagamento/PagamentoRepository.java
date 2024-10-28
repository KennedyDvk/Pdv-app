package br.com.arena.pdv_app.domain.pagamento;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PagamentoRepository extends MongoRepository<Pagamento, String> {
}
