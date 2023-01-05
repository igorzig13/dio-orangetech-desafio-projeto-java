package br.edu.igorzig13.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Atividade> atividades = new LinkedHashSet<>();

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

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(Set<Atividade> atividades) {
        this.atividades = atividades;
    }

    @Override
    public String toString() {
        return this.getNome() + "\nDescrição: " +
                this.getDescricao() + "\nLista de inscritos: " +
                this.getDevsInscritos().stream()
                        .map(Dev::getNome)
                        .collect(Collectors.joining(", ")) + "\nData Inicial: " +
                this.getDataInicial() + "\nData Final: " +
                this.getDataFinal();
    }
}
