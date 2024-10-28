package br.com.arena.pdv_app.domain.itemPedido;

import br.com.arena.pdv_app.domain.produto.Produto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ItemPedido")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemPedido {

    @Id
    private String id;

    private int quantidade;

    private double precoUnitario;

    private double subtotal;

    @DBRef
    private Produto produto;
}
