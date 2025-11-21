package br.com.globalsolution.mentor.service;

import br.com.globalsolution.mentor.domain.Usuario;
import br.com.globalsolution.mentor.exception.UsuarioNaoEncontradoException;
import br.com.globalsolution.mentor.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    public Usuario buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new UsuarioNaoEncontradoException(id));
    }

    @Transactional
    public Usuario criar(Usuario usuario) {
        if (repository.existsByEmail(usuario.getEmail())) {
            throw new IllegalArgumentException("Email já cadastrado");
        }
        return repository.save(usuario);
    }

    @Transactional
    public Usuario atualizar(Long id, Usuario dadosAtualizados) {
        Usuario existente = buscarPorId(id);

        existente.setNome(dadosAtualizados.getNome());
        existente.setEmail(dadosAtualizados.getEmail());
        existente.setAreaAtuacao(dadosAtualizados.getAreaAtuacao());
        existente.setNivelCarreira(dadosAtualizados.getNivelCarreira());

        return repository.save(existente);
    }

    @Transactional
    public void deletar(Long id) {
        Usuario existente = buscarPorId(id);
        repository.delete(existente);
    }
}
