public class Aula implements Comparable<Aula> {
    private String aula;
    private int tempo;

    public Aula(String aula, int tempo) {
        this.aula = aula;
        this.tempo = tempo;
    }

    public String getAula() {
        return aula;
    }

    public int getTempo() {
        return tempo;
    }

    //O java transforma um objeto para uma string através do método toString
    @Override
    public String toString() {
        return "Aula: " + this.aula + " Tempo da aula: " + this.tempo + "min";
    }

    //Definindo critério de comparação
    @Override
    public int compareTo(Aula aulaParam) {
        return this.aula.compareTo(aulaParam.aula);
    }
}
