public class TestaCursoComAlunoMap {
    public static void main(String[] args) {
        Curso javaCollections = new Curso("Java Collections", "Paulo");
        Aluno a1 = new Aluno("Luana", 5156);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);
        Aluno a4 = new Aluno("Gelson", 1985);

        javaCollections.matricula(a1);
        javaCollections.matricula(a2);
        javaCollections.matricula(a3);

        System.out.println(javaCollections.buscaMatriculado(5156));
        System.out.println(javaCollections.estaMatriculado(a1));
        System.out.println(javaCollections.estaMatriculado(a4));

    }
}
