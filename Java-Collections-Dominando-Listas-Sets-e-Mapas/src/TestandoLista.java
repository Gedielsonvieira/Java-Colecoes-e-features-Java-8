import java.util.ArrayList;
import java.util.Collections;

public class TestandoLista {
    public static void main(String[] args) {
        String aula1 = "Set";
        String aula2 = "Arraylist";
        String aula3 = "Map";

        ArrayList<String> listaAulas = new ArrayList<>();

        listaAulas.add(aula1);
        listaAulas.add(aula2);
        listaAulas.add(aula3);

        System.out.println("Lista de aulas: " + listaAulas);

        System.out.println("\nIterando sobre a lista");
        listaAulas.forEach((aula)-> {
            System.out.println(aula);
        });

        listaAulas.remove(2);

        System.out.println("\nIterando sobre a lista após remoção de um elemento");
        listaAulas.forEach((aula)-> {
            System.out.println(aula);
        });

        System.out.println("\nAcessando o primeiro elemento da lista");
        System.out.println(listaAulas.get(0));

        System.out.println("\nOrdenando a lista por ordem alfabética");
        Collections.sort(listaAulas);
        listaAulas.forEach((aula)-> {
            System.out.println(aula);
        });

    }
}
