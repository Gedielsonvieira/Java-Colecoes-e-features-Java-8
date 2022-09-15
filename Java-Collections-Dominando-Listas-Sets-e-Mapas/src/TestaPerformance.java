import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

    public static void main(String[] args) {

        // ArrayList - a inserção é bem rápida e a busca muito lenta!
        // HashSet, a inserção ainda é rápida, embora um pouco mais lenta do que a das listas. Mas a busca é muito rápida!

        Collection<Integer> numeros = new ArrayList<Integer>();
        //Collection<Integer> numeros = new HashSet<>();

        //computando o tempo gasto em cada for separadamente.
        long inicioAdd = System.currentTimeMillis();
        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }
        long fimAdd = System.currentTimeMillis();
        long tempoDeExecucaoAdd = fimAdd - inicioAdd;

        long inicioIteracao = System.currentTimeMillis();
        for (Integer numero : numeros) {
            numeros.contains(numero);
        }
        long fimIteracao = System.currentTimeMillis();
        long tempoDeExecucaoIteracao = fimIteracao - inicioIteracao;

        System.out.println("Tempo gasto adicionando elementos: " + tempoDeExecucaoAdd + "ms");
        System.out.println("Tempo gasto iterando sobre os elementos: " + tempoDeExecucaoIteracao + "ms");
    }
}