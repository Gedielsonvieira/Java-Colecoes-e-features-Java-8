//Escreva um programa Java para associar o valor especificado à chave especificada em um HashMap.
//Escreva um programa Java para contar o número de mapeamentos de valor-chave (tamanho) em um mapa
//Escreva um programa Java para copiar todos os mapeamentos do mapa especificado para outro mapa.
package ExerciciosMap;

import java.util.HashMap;
import java.util.Map;

public class ExercicioMap2 {
    public static void main(String[] args) {
        Map<String, String> carro = new HashMap<>();
        carro.put("BMW", "iX");
        carro.put("FIAT", "Mobi");
        carro.put("Nissan", "Mazda");
        carro.put("Ford", "Fusion");

        System.out.println(carro.get("BMW"));
        System.out.println("Tamanho de mapeamentos: " + carro.size());

        Map<String, String> carro2 = new HashMap<>(carro);
        System.out.println("Copia de mapeamentos: " + carro2);
    }
}
