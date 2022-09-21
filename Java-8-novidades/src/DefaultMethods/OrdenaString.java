/*
Imprimir cada uma dessas Strings com o novo método default, o forEach.
*/

package DefaultMethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        Comparator<String> comparador = new ComparatorPorTamanho();
        palavras.sort(comparador);

        Consumer<String> consumer = new ImprimeNaLinha();
        palavras.forEach(consumer);
    }
}

class ImprimeNaLinha implements Consumer<String>{
    //Para cada string a imprime
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparatorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String palavra1, String palavra2) {
        return palavra1.length() -  palavra2.length();
    }
}