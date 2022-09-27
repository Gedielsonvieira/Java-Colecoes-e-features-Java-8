package Streams.Exercicios;

import Streams.Curso;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class MediaComStream {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        //Exercicio 2: Calcular a quantidade média de alunos de todos os seus cursos utilizando a API de Stream.
        OptionalDouble media = cursos.stream()
                .mapToInt(c -> c.getAlunos())
                .average();

        System.out.println(media);
    }
}
