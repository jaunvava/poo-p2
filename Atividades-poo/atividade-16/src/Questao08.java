import java.util.HashMap;
import java.util.Map;

public class Questao08 {
    public static void main(String[] args) {
        HashMap<String, Integer> pessoas = new HashMap<>();
        
        pessoas.put("João", 25);
        pessoas.put("Maria", 30);
        pessoas.put("Pedro", 28);
        
        System.out.println("Lista de pessoas e suas idades:");
        System.out.println("--------------------------------");
        
        for (Map.Entry<String, Integer> entrada : pessoas.entrySet()) {
            String nome = entrada.getKey();
            Integer idade = entrada.getValue();
            System.out.println(nome + " tem " + idade + " anos");
        }
    }
}