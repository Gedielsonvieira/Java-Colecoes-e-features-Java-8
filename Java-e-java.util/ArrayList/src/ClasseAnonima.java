import java.util.ArrayList;
import java.util.Comparator;

public class ClasseAnonima {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(8,44);
        ContaCorrente cc2 = new ContaCorrente(20,03);
        ContaCorrente cc3 = new ContaCorrente(10,92);
        ContaCorrente cc4 = new ContaCorrente(50,11);

        ArrayList<ContaCorrente> listaDeContas = new ArrayList<>();
        listaDeContas.add(cc1);
        listaDeContas.add(cc2);
        listaDeContas.add(cc3);
        listaDeContas.add(cc4);

        //Classe anônima- Neste caso é instanciada uma classe internamente que implementa a interface Comparator
        listaDeContas.sort(new Comparator<ContaCorrente>(){
            @Override
            public int compare(ContaCorrente param1, ContaCorrente param2) {
                return Integer.compare(param1.getNumero(), param2.getNumero());
            }
        });

        for (ContaCorrente cc: listaDeContas){
            // Lembrando que ao imprimir a conta é chamar o método toString por baixo dos panos
            System.out.println(cc);
        }

    }
}