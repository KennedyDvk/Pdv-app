package br.com.arena.pdv_app.domain.pagamento;

import br.com.arena.pdv_app.domain.pedido.Pedido;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Pagamentos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pagamento {

    @Id
    private String id;
    private String tipoPagamento;
    private double valorPago;
    private Date dataHora;

    @DBRef
    private Pedido pedido;
}
