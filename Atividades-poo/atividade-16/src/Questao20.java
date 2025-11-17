import java.util.HashMap;
import java.util.Map;

public class Questao20 {
    public static void main(String[] args) {
        Map<Integer, String> diasDaSemana = new HashMap<>();
        
        diasDaSemana.put(1, "Segunda-feira");
        diasDaSemana.put(2, "Terça-feira");
        diasDaSemana.put(3, "Quarta");
        diasDaSemana.put(4, "Quinta-feira");
        diasDaSemana.put(5, "Sexta-feira");
        
        System.out.println("Mapa antes da modificação:");
        System.out.println(diasDaSemana);
        
        diasDaSemana.put(3, "Quarta-feira");
        
        System.out.println("\nMapa após a modificação:");
        System.out.println(diasDaSemana);
        
        System.out.println("\nMapa formatado:");
        for (Map.Entry<Integer, String> entry : diasDaSemana.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + " → Valor: " + entry.getValue());
        }
    }
}