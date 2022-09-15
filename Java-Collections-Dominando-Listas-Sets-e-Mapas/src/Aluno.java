public class Aluno {
    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public String toString() {
        return "[Aluno(a): " + this.nome + ", matrícula: " + this.numeroMatricula + "]";
    }
}
