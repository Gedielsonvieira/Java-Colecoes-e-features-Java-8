public class Conta {
    private int agencia;
    private int numero;
    private double saldo;
    private Cliente titular;

    public Conta(int Agencia, int Numero) {
        this.agencia = Agencia;
        this.numero = Numero;
    }
    public void deposita(double v) {
        this.saldo = this.saldo = v;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Numero: " + this.numero + ", Agencia: " + this.agencia;
    }

    @Override
    public boolean equals(Object ref) {
        /*
            Type cast - referencia é do tipo object que no caso é o objeto mais generico e que não possui o atributo agencia e
            numero por isso fazemos o type cast ou cast para um objeto mais especifico do tipo conta que tem os atributos
        */
        Conta outraConta = (Conta) ref;

        if (this.agencia != outraConta.agencia || this.numero != outraConta.numero) {
            return false;
        } else {
            System.out.println("Agencia parametro: " + this.agencia + " Agencia Classe: " + outraConta.agencia);
            System.out.println("Numero parametro: " + this.numero + " Numero Classe: " + outraConta.numero);
            return true;
        }
    }
}
