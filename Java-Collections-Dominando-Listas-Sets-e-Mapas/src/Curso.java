import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<Aula>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        // impedindo de pegar e modificar(adiciona, remover...) uma aula através do atributo privado aulas que é uma lista
        // unmodifiableList - retorna uma lista apenas de leitura
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public int getTempoTotal(){
        int tempoTotal = 0;
        for (Aula aula: aulas) {
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;
    }

    @Override
    public String toString() {
        return "[Curso:" + this.nome + ", tempo total: " + getTempoTotal() + "min]";
    }
}
