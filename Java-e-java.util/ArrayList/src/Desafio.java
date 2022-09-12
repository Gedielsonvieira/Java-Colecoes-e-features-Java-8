import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
Investigue a documentação oficial da classe Collections dentro do pacote java.util:

Como podemos inverter a ordem de uma lista?
Como podemos embaralhar todos os elementos de uma lista?
Como podemos rotacionar os elementos de uma lista?
*/
public class Desafio {
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

        Conta cc4 = new ContaCorrente(82, 91);
        Cliente clienteCC4 = new Cliente();
        clienteCC3.setNome("Palinha");
        cc3.setTitular(clienteCC4);
        cc3.deposita(11.0);

        ArrayList<Conta> listaDeCc = new ArrayList<Conta>();

        listaDeCc.add(cc1);
        listaDeCc.add(cc2);
        listaDeCc.add(cc3);
        listaDeCc.add(cc4);

        System.out.println("Array normal");
        for (Conta conta: listaDeCc) {
            System.out.println(conta);
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=\n");

        Collections.reverse(listaDeCc);
        System.out.println("Array Invertido");
        for (Conta conta: listaDeCc) {
            System.out.println(conta);
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=\n");

        Collections.shuffle(listaDeCc);
        System.out.println("Array embaralhado");
        for (Conta conta: listaDeCc) {
            System.out.println(conta);
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=\n");

        Collections.rotate(listaDeCc, 1);
        System.out.println("Array rotacionado");
        for (Conta conta: listaDeCc) {
            System.out.println(conta);
        }
    }
}