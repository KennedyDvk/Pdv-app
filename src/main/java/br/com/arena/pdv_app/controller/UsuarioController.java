package br.com.arena.pdv_app.controller;

import br.com.arena.pdv_app.domain.usuario.DadosCadastroUsuario;
import br.com.arena.pdv_app.domain.usuario.DadosListagemUsuario;
import br.com.arena.pdv_app.domain.usuario.Usuario;
import br.com.arena.pdv_app.domain.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar (@RequestBody DadosCadastroUsuario dados, UriComponentsBuilder uriBuilder) {
        var usuario = new Usuario(dados);
        repository.save(usuario);
        var uri = uriBuilder.path("/usuario/{id}").buildAndExpand(usuario.getId()).toUri();

        return ResponseEntity.created(uri).body(new DadosListagemUsuario(usuario));
    }
}
