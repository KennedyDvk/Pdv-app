package br.com.arena.pdv_app.domain.itemPedido;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemPedidoRepository extends MongoRepository<ItemPedido, String> {
}
