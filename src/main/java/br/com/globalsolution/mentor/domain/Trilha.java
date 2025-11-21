package br.com.globalsolution.mentor.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "trilhas")
public class Trilha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome da trilha é obrigatório")
    @Size(max = 150)
    private String nome;

    @Size(max = 1000)
    private String descricao;

    @NotBlank(message = "Nível é obrigatório")
    @Pattern(regexp = "INICIANTE|INTERMEDIARIO|AVANCADO",
            message = "Nível deve ser INICIANTE, INTERMEDIARIO ou AVANCADO")
    private String nivel;

    @Min(value = 1, message = "Carga horária deve ser positiva")
    @Column(name = "carga_horaria")
    private Integer cargaHoraria;

    @Size(max = 100)
    @Column(name = "foco_principal")
    private String focoPrincipal;

    // getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getFocoPrincipal() {
        return focoPrincipal;
    }

    public void setFocoPrincipal(String focoPrincipal) {
        this.focoPrincipal = focoPrincipal;
    }
}
