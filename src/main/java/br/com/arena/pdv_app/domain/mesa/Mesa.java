package br.com.arena.pdv_app.domain.mesa;

import br.com.arena.pdv_app.domain.pedido.Pedido;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Mesas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mesa {

    @Id
    private String id;

    private int numeroMesa;

    private String status;

    @DBRef
    private Pedido pedidoAtual;
}
