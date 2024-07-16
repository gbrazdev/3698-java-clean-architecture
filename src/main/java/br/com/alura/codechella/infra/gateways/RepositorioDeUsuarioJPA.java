package br.com.alura.codechella.infra.gateways;

import br.com.alura.codechella.application.gateway.RepositorioDeUsuario;

import br.com.alura.codechella.domain.entities.usuario.Usuario;
import br.com.alura.codechella.infra.persistence.UsuarioEntity;
import br.com.alura.codechella.infra.persistence.UsuarioRepository;

import java.util.List;

public class RepositorioDeUsuarioJPA implements RepositorioDeUsuario {

    private final UsuarioRepository repositorio;

    private final UsuarioEntityDTO dto;

    public RepositorioDeUsuarioJPA(UsuarioRepository repositorio, UsuarioEntityDTO dto) {
        this.repositorio = repositorio;
        this.dto = dto;
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        UsuarioEntity entity = dto.toEntity(usuario);
        repositorio.save(entity);
        return dto.toDomain(entity);
    }


    @Override
    public List<UsuarioEntity> listarTodos() {
        return repositorio.findAll();
    }
}
