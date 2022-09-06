public class Conta {
    private int agencia;
    private int numero;

    public Conta(int Agencia, int Numero) {
        this.agencia = Agencia;
        this.numero = Numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Numero: " + this.numero + ", Agencia: " + this.agencia;
    }
}
