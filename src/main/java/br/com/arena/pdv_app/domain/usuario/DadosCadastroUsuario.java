package br.com.arena.pdv_app.domain.usuario;

import static org.springframework.util.StringUtils.capitalize;

public record DadosCadastroUsuario(
        String nome,
        String sobrenome,
        String email,
        String senha,
        String funcao) {

    public DadosCadastroUsuario(String nome, String sobrenome, String email, String senha, String funcao) {
        this.nome = capitalize(nome);
        this.sobrenome = capitalize(sobrenome);
        this.email = email;
        this.senha = senha;
        this.funcao = capitalize(funcao);
    }

    private static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
