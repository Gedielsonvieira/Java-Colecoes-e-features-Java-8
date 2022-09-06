public class TesteArrayReferencias {
    public static void main(String[] args) {
        Conta contas[] = new Conta[5];
        Conta c1 = new Conta(111,111);
        contas[0] = c1;

        System.out.println(contas[0].getAgencia());

        /*
        acessando a segunda posição do array que por sua vez retorna um valor e esse valor é uma referencia
        e esta referencia esta guardada em uma variavel do tipo g.Conta
        */
        System.out.println(contas[0]);
    }

    //po que é static
}
