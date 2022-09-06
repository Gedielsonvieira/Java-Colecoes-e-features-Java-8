public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    // internamente, o System.out.println() utiliza o toString()
    @Override
    public String toString() {
        return "ContaCorrente, " + super.toString();
    }

}
