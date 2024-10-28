package br.com.arena.pdv_app.domain.relatorio;

import br.com.arena.pdv_app.domain.pedido.Pedido;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "Relatorios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Relatorio {

    @Id
    private String id;

    private Date dataInicial;

    private Date dataFinal;

    private double totalVendas;

    @DBRef
    private List<Pedido> pedidos;
}
