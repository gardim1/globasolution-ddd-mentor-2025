package br.com.globalsolution.mentor.controller;

import br.com.globalsolution.mentor.domain.Trilha;
import br.com.globalsolution.mentor.service.TrilhaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trilhas")
public class TrilhaController {

    private final TrilhaService service;

    public TrilhaController(TrilhaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Trilha> listarTodas() {
        return service.listarTodas();
    }

    @GetMapping("/{id}")
    public Trilha buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public ResponseEntity<Trilha> criar(@Valid @RequestBody Trilha trilha) {
        Trilha criada = service.criar(trilha);
        return ResponseEntity.status(HttpStatus.CREATED).body(criada);
    }

    @PutMapping("/{id}")
    public Trilha atualizar(@PathVariable Long id,
                            @Valid @RequestBody Trilha trilha) {
        return service.atualizar(id, trilha);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
