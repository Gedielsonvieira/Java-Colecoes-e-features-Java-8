import java.util.*;

public class TesteEmptySet {

    public static void main(String[] args) {

        Set<String> nomes = Collections.emptySet();
        nomes.add("Paulo");
        /*
            Um conjunto destinado a ser vazio não pode ter um elemento.
            Um conjunto vazio pode ser útil para representar um curso que foi cancelado pois não teve matriculas.
            Nesse caso faria sentido devolver um Collesctions.emptySet()
        */
    }

}