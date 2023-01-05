package br.edu.igorzig13.desafio.dominio;

import java.util.Objects;

public abstract class Atividade {
    protected static final double XP_PADRAO = 10.0;
    private String titulo;
    private String descricao;

    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atividade atividade = (Atividade) o;
        return Objects.equals(titulo, atividade.titulo) && Objects.equals(descricao, atividade.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, descricao);
    }
}
