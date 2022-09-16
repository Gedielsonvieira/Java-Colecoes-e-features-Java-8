import java.util.Collections;
import java.util.Set;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaCollections = new Curso("Java Collections", "Paulo");
        Aluno a1 = new Aluno("Luana", 5156);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaCollections.matricula(a1);
        javaCollections.matricula(a2);
        javaCollections.matricula(a3);

        Aluno luana = new Aluno("Luana", 5156);
        System.out.println("O" + a1 + "é equals a luana: " + a1.equals(luana));

        System.out.println(javaCollections.estaMatriculado(luana));

        System.out.println(javaCollections.getAlunos());

        /*
        javaCollections.getAlunos().add(a1);
        Recebemos uma exceção do tipo UnsupportedOperationException:
        Isso acontece pois o conjunto não pode ser modificado pois retornamos na classe Curso um Collections.unmodifiableSet(alunos).
        */
    }
}
