package ApiDeData;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Data {
    public static void main(String[] args) {
        //porque não consigo instanciar LocalDate?
        LocalDate agora =  LocalDate.now();
        System.out.println(agora);

        //Data futura
        LocalDate algumDia = LocalDate.of(2099,1,25);
        System.out.println(algumDia);

        //Periodo entre duas datas
        Period intervalo = Period.between(agora, algumDia);
        System.out.println(intervalo.getYears());

        //Data de hoje formatada
        DateTimeFormatter  dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String valorFormatado = agora.format(dataFormatada);
        System.out.println(valorFormatado);



    }

}
