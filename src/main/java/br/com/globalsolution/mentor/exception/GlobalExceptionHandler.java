package br.com.globalsolution.mentor.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UsuarioNaoEncontradoException.class)
    public ResponseEntity<Map<String, String>> handleUsuarioNaoEncontrado(UsuarioNaoEncontradoException ex) {
        Map<String, String> body = new HashMap<>();
        body.put("erro", ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);
    }

    @ExceptionHandler(TrilhaNaoEncontradaException.class)
    public ResponseEntity<Map<String, String>> handleTrilhaNaoEncontrada(TrilhaNaoEncontradaException ex) {
        Map<String, String> body = new HashMap<>();
        body.put("erro", ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidacao(MethodArgumentNotValidException ex) {
        Map<String, String> erros = new HashMap<>();
        for (FieldError fe : ex.getBindingResult().getFieldErrors()) {
            erros.put(fe.getField(), fe.getDefaultMessage());
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erros);
    }
    /*
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, String>> handleGeral(Exception ex) {
        Map<String, String> body = new HashMap<>();
        body.put("erro", "Erro interno do servidor");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(body);
    }*/
}
