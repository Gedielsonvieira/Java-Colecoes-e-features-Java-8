import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaCollections = new Curso("Java Collections","Paulo");
        javaCollections.adiciona(new Aula("Relacionamento com coleções", 30));
        javaCollections.adiciona(new Aula("Lista de objetos", 24));

        System.out.println(javaCollections.getAulas());
    }
}
