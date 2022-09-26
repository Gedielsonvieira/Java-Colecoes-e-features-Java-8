package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestaCurso {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        //Lambda:
        //Ordenando pela quantidade de alunos
        cursos.sort(Comparator.comparing(c -> c.getAlunos()));

        //Method reference:
        //Ordenando pela quantidade de alunos
        cursos.sort(Comparator.comparing(Curso::getAlunos));

        //Não podemos dar System.out.println(cursos) porque quando damos System.out.println em um object ele chama o toString da classe e nós não sobrescrevemos o método toString
        System.out.println(cursos);

        cursos.forEach(curso -> {
            System.out.println(curso.getNome());
        });

        System.out.println();

        //Utilizando a API de Stream, para criar um filtro para todos os cursos que tenham mais de 50 alunos.
        cursos.stream()
                .filter(curso -> curso.getAlunos() >= 50)
                .forEach(curso -> System.out.println(curso.getNome()));

        System.out.println();

        //transformando o Stream<Curso> em um Stream<String> contendo apenas os nomes dos cursos
        Stream<String> nomes = cursos.stream().map(Curso::getNome);
        nomes.forEach(System.out::println);

        System.out.println();


        List<String> nomesSemIterar = cursos.stream().map(Curso::getNome).collect(Collectors.toList());
        System.out.println(nomesSemIterar);

    }
}
