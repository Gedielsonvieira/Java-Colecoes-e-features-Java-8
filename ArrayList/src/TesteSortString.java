import java.util.ArrayList;
import java.util.Comparator;

public class TesteSortString {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaCorrente(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaCorrente(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        ArrayList<Conta> listaDeContas = new ArrayList<>();
        listaDeContas.add(cc1);
        listaDeContas.add(cc2);
        listaDeContas.add(cc3);
        listaDeContas.add(cc4);

        for (Conta conta: listaDeContas) {
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        listaDeContas.sort(new TitularDaContaCompar());

        for (Conta conta: listaDeContas){
            // Lembrando que ao imprimir a conta é chamar o método toString por baixo dos panos
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }

    }
}

class TitularDaContaCompar implements Comparator<Conta>{

    @Override
    public int compare(Conta c1, Conta c2) {
        String nomeC1 = c1.getTitular().getNome();
        String nomeC2 = c2.getTitular().getNome();
        return nomeC1.compareTo(nomeC2);// resultado é um int
    }
}