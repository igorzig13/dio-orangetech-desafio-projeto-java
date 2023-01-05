package br.edu.igorzig13.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Atividade{
    private LocalDate data;

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * 2;
    }

    @Override
    public String toString() {
        return getTitulo() +
                "\nDescrição: " + getDescricao() +
                "\nData: " + this.getData();
    }
}
