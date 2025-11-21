package br.com.globalsolution.mentor.exception;

public class TrilhaNaoEncontradaException extends RuntimeException {
    public TrilhaNaoEncontradaException(Long id) {
        super("Trilha não encontrada com id " + id);
    }
}
