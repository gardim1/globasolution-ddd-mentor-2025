package br.com.globalsolution.mentor.service;

import br.com.globalsolution.mentor.domain.Trilha;
import br.com.globalsolution.mentor.exception.TrilhaNaoEncontradaException;
import br.com.globalsolution.mentor.repository.TrilhaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TrilhaService {

    private final TrilhaRepository repository;

    public TrilhaService(TrilhaRepository repository) {
        this.repository = repository;
    }

    public List<Trilha> listarTodas() {
        return repository.findAll();
    }

    public Trilha buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new TrilhaNaoEncontradaException(id));
    }

    @Transactional
    public Trilha criar(Trilha trilha) {
        return repository.save(trilha);
    }

    @Transactional
    public Trilha atualizar(Long id, Trilha dadosAtualizados) {
        Trilha existente = buscarPorId(id);

        existente.setNome(dadosAtualizados.getNome());
        existente.setDescricao(dadosAtualizados.getDescricao());
        existente.setNivel(dadosAtualizados.getNivel());
        existente.setCargaHoraria(dadosAtualizados.getCargaHoraria());
        existente.setFocoPrincipal(dadosAtualizados.getFocoPrincipal());

        return repository.save(existente);
    }

    @Transactional
    public void deletar(Long id) {
        Trilha existente = buscarPorId(id);
        repository.delete(existente);
    }
}
