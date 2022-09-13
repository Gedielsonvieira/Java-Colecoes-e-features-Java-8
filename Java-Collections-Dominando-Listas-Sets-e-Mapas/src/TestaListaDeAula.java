import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
    public static void main(String[] args) {
        Aula aula1 = new Aula("Java e java.util: Coleções, Wrappers e Lambda expressions.", 380);
        Aula aula2 = new Aula("Java Collections.", 480);
        Aula aula3 = new Aula("Java Exceções: aprenda a criar, lançar e controlar exceções.", 720);

        ArrayList <Aula> listaDeAulas = new ArrayList<>();
        listaDeAulas.add(aula1);
        listaDeAulas.add(aula2);
        listaDeAulas.add(aula3);

        listaDeAulas.forEach((aula) ->{
            /* A variável aula iria imprimir a referencia de uma aula, porém,
            ao imprimir a referência de uma aula, automaticamente o Java chama o método toString que foi sobrecrito na classe Aula */
            System.out.println(aula);
        });

        /* Collections.sort(listaDeAulas); - Não funcionou porque a classe Aula não tem o método compareTo.
        Em uma string funciona porque toda string tem o método compareTo que faz uma comparação Lexicograficamente,
        após implementação do compareTo na classe Aula irá funciona. */
        System.out.println("\nLista ordenada Lexicograficamente:");
        Collections.sort(listaDeAulas);
        listaDeAulas.forEach((aula) ->{
            System.out.println(aula);
        });

        System.out.println("\nLista ordenada pelo tempo:");
        Collections.sort(listaDeAulas, Comparator.comparing(Aula::getTempo));
        listaDeAulas.forEach((aula) ->{
            System.out.println(aula);
        });
    }
}
