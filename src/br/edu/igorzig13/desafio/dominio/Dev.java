package br.edu.igorzig13.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Atividade> atividadesInscritas = new LinkedHashSet<>();
    private Set<Atividade> atividadesConcluidas = new LinkedHashSet<>();

    public void inscreverBootcamp (Bootcamp bootcamp){
        this.atividadesInscritas.addAll(bootcamp.getAtividades());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional<Atividade> atividade = this.atividadesInscritas.stream().findFirst();
        if (atividade.isPresent()){
            this.atividadesConcluidas.add(atividade.get());
            this.atividadesInscritas.remove(atividade.get());
            System.out.println(this.getNome() + " concluiu a atividade: " + atividade.get().getTitulo());
        } else {
            System.out.println(this.getNome() + " não está inscrito em nenhuma atividade. Impossível progredir!");
        }
    }

    public double calcularTotalXp (){
        return this.getAtividadesConcluidas().stream()
                .mapToDouble(Atividade::calcularXP)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Atividade> getAtividadesInscritas() {
        return atividadesInscritas;
    }

    public void setAtividadesInscritas(Set<Atividade> atividadesInscritas) {
        this.atividadesInscritas = atividadesInscritas;
    }

    public Set<Atividade> getAtividadesConcluidas() {
        return atividadesConcluidas;
    }

    public void setAtividadesConcluidas(Set<Atividade> atividadesConcluidas) {
        this.atividadesConcluidas = atividadesConcluidas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return nome.equals(dev.nome) && Objects.equals(atividadesInscritas, dev.atividadesInscritas) && Objects.equals(atividadesConcluidas, dev.atividadesConcluidas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, atividadesInscritas, atividadesConcluidas);
    }
}
