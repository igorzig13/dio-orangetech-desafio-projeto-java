package br.edu.igorzig13.desafio.dominio;

public class Curso extends Atividade{
    private int cargaHoraria;

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + cargaHoraria * 2d;
    }

    @Override
    public String toString() {
        return getTitulo() +
                "\nDescrição: " + getDescricao() +
                "\nCarga horária: " + getCargaHoraria();
    }
}
