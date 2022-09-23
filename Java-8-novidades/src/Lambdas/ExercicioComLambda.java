package Lambdas;

/*
Considere o seguinte código que executa um Runnable em uma Thread:
Como podemos escrevê-lo usando uma expressão lambda?
*/


public class ExercicioComLambda {
    public static void main(String[] args) {
        //Classe anonima
        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Executando um Runnable");
            }

        }).start();

        /*
        Como os parâmetros passados, seguindo a sintaxe do lambda, serão os parâmetros que o método abstrato da interface funcional receberia,
        como o método run() da interface Runnable não recebe nenhum argumento, o parâmetro é passado como vazio.
        */
        new Thread(() -> {
            System.out.println("Executando um Runnable -  Atividade realizada");
        }).start();

    }
}
