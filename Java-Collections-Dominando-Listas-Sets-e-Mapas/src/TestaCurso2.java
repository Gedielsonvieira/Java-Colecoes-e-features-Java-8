import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso javaCollections = new Curso("Java Collections","Paulo");
        javaCollections.adiciona(new Aula("Relacionamento com coleções", 30));
        javaCollections.adiciona(new Aula("Lista de objetos", 24));

        System.out.println(javaCollections);

        List<Aula> aulasImutaveis = javaCollections.getAulas();

        /*
         Como é uma boa prática somente o objeto manipular seus atributos para podermos ordenar a lista,
         criamos uma lista mutável que recebe como parametro a lista Imutável por utilizarmos unmodifiableList e
         assim podemos ordenar a lista.
        */
        ArrayList<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);

        System.out.println("\nLista ordenada: \n" + aulas);

    }
}
