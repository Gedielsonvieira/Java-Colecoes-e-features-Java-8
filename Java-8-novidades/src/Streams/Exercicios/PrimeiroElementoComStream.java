package Streams.Exercicios;

import Streams.Curso;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PrimeiroElementoComStream {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        //Exercício 1: Pegar o primeiro elemento do Stream filtrado
        Optional<Curso> optional = cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .findFirst();

        optional.stream().forEach(c -> System.out.println(c.getNome()));
    }
}
