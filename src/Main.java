import br.edu.igorzig13.desafio.dominio.*;

import java.time.LocalDate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Bootcamp orangetechBackend = new Bootcamp();
        Mentoria mentoria1 = new Mentoria();
        Curso cursoJavaChines = new Curso();
        Curso cursoSpring = new Curso();
        Dev igor = new Dev();
        Dev marques = new Dev();

        mentoria1.setTitulo("Mentoria 1 - Aula Inaugural");
        mentoria1.setData(LocalDate.of(2023,1,12));
        mentoria1.setDescricao("Uma mentoria bem louca com altas confusões.");

        cursoJavaChines.setTitulo("Java Avançado - Metodologia Chinesa");
        cursoJavaChines.setDescricao("Um curso baseado na metodologia de Xin Aki Javah");
        cursoJavaChines.setCargaHoraria(20);

        cursoSpring.setTitulo("Spring - Introdução ao Spring Boot");
        cursoSpring.setDescricao("Um curso para aprender a inicializar uma aplicação web com Spring Boot.");
        cursoSpring.setCargaHoraria(10);

        igor.setNome("Igor Marques");
        marques.setNome("Marques de Lima");

        orangetechBackend.setNome("Bootcamp OrangeTech + BackEnd");
        orangetechBackend.setDescricao("Um Bootcamp do banco Inter em parceria com a DIO.");
        orangetechBackend.getAtividades().add(mentoria1);
        orangetechBackend.getAtividades().add(cursoJavaChines);
        orangetechBackend.getAtividades().add(cursoSpring);

        igor.inscreverBootcamp(orangetechBackend);
        marques.inscreverBootcamp(orangetechBackend);

        System.out.println("Igor está inscrito nas seguintes atividades: \n" + igor.getAtividadesInscritas().stream().map(Atividade::getTitulo).collect(Collectors.joining(";\n")));

        igor.progredir();
        igor.progredir();

        marques.progredir();

        System.out.println("\nA XP total de Igor é: " + igor.calcularTotalXp());
        System.out.println("A XP total de Marques é: " + marques.calcularTotalXp());

        System.out.println("\n"+orangetechBackend);

        System.out.println("\nIgor está inscrito nas seguintes atividades: \n" + igor.getAtividadesInscritas().stream().map(Atividade::getTitulo).collect(Collectors.joining(";\n")));

    }
}