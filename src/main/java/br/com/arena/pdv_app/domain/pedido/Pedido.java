package br.com.arena.pdv_app.domain.pedido;

import br.com.arena.pdv_app.domain.itemPedido.ItemPedido;
import br.com.arena.pdv_app.domain.usuario.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "Pedidos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

    @Id
    private String id;

    private Date dataHora;

    private String formaPagamento;

    @DBRef
    private Usuario atendente;

    @DBRef
    private List<ItemPedido> itens;
}
