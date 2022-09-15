import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<String>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");
        alunos.add("Nico");


        /* para cada aluno dentro de alunos (coleção) imprima o aluno
        for (String aluno:alunos) {
            System.out.println(aluno);
        }*/

        alunos.forEach((aluno)->{
            System.out.println(aluno);
        });

        System.out.println("\nTamanho coleção: " + alunos.size());

        //comprovando que o set não não aceita elementos duplicados
        alunos.add("Nico");

        System.out.println("\nTamanho coleção: " + alunos.size());
    }
}
