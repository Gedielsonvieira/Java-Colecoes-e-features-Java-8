// forEach usando method reference no lugar do lambda
// comparando através do hashcode ao invés do tamanho da string
// método comparing com method reference

package MethodReference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercicios {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("caelum");
        palavras.add("casa do código");
        palavras.add("alura online");

        /*
        method reference:
        palavras.forEach(System.out::println);
        O Java 8 consegue perceber que tem um println que recebe objetos, e invocará esse método, passando a String da vez.
        */

        palavras.forEach(System.out::println);//X
        System.out.println();

        palavras.sort(Comparator.comparing(String::hashCode));//X

        System.out.println("Ordenando através do hashcode via method reference:");
        palavras.forEach(s -> {
            System.out.println(s + " " +s.hashCode());
        });

    }
}
