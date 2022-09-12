import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(11, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        Conta cc3 = new Conta(22,22);

        boolean igual = lista.contains(cc3);
        System.out.println("Apontam para o mesmo objeto? " + igual);

        System.out.println("--------------------------");

        for(Conta conta : lista) {
            System.out.println(conta);
        }
    }
}
