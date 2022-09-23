package Lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ImprimeComLambda {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        palavras.forEach((palavra)->{
            System.out.println(palavra);
        });

        palavras.sort((s1, s2)->{
         return Integer.compare(s1.length(),s2.length());
        });

        System.out.println("\n" + palavras);
    }
}
