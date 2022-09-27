package Streams.Exercicios;

import Streams.Curso;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamParaList {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        //Exercicio 3: transformar esse Stream<Curso> filtrado em uma List<Curso>
        Stream<Curso> stream = cursos.stream()
                .filter(c -> c.getAlunos() > 50);
        System.out.println("Isto é um Stream: " + stream);
        stream.forEach(c -> System.out.println(c.getNome()));

        System.out.println();

        //Primeira forma de fazer
        List<Curso> lista = cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .toList();
        System.out.println("Isto é uma lista: " + lista);
        lista.forEach(cursoDaLista -> System.out.println(cursoDaLista.getNome()) );

        System.out.println();

        //Segunda forma de fazer
        List<Curso> cursosFiltrados = cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .collect(Collectors.toList());
        System.out.println("Isto é uma lista: " + cursosFiltrados);
        cursosFiltrados.forEach(cursoDaLista -> System.out.println(cursoDaLista.getNome()) );

    }
}
