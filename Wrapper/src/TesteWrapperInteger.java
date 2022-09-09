import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
    public static void main(String[] args) {
        /* Teste autoboxing/unboxing usando o wrapper */
        Integer idadeRef = 29; //Internamente ocorre o autoboxing - transformação do tipo primitivo para objeto
        int primitivo = new Integer(21); // Internamente ocorre o unboxing - transformação de objeto para tipo primitivo


        List<Integer> lista = new ArrayList<>();//Lista só aceita referencia
        lista.add(idadeRef);//ok
        lista.add(primitivo);//para add ocorre o Autoboxing

        System.out.println(lista.get(0));//para mostrar na tela ocorre o unboxing
        System.out.println(lista.get(1));//ok

        /* Métodos da classe Integer */
        Integer valorRef = Integer.valueOf(33);// delegando a criação para método valueOf
        int valorPrimitivo = valorRef.intValue();//desembrulhando, pegando o valor primitivo do objeto wrapper

        System.out.println(valorPrimitivo);

        /* Teste parsing - conversão de String para um tipo específico*/
        Integer iParseado1 = Integer.valueOf("42");
        Integer iParseado2 = Integer.parseInt("44");

        System.out.println(iParseado1);
        System.out.println(iParseado2);
    }
}
