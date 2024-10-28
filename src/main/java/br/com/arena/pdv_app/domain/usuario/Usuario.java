package br.com.arena.pdv_app.domain.usuario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Usuarios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    private String id;

    private String nome;

    private String sobrenome;

    private String email;

    private String senha;

    private String funcao;

    public Usuario(DadosCadastroUsuario dados) {
        this.nome = dados.nome();
        this.sobrenome = dados.sobrenome();
        this.email = dados.email();
        this.senha = dados.senha();
        this.funcao = dados.funcao();
    }

}
