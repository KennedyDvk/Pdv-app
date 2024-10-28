package br.com.arena.pdv_app.domain.usuario;

public record DadosListagemUsuario(
        String id,
        String nome,
        String sobrenome,
        String email,
        String senha,
        String funcao
) {

    public DadosListagemUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getNome(), usuario.getSobrenome(), usuario.getEmail(), usuario.getSenha(), usuario.getFuncao());
    }

}

