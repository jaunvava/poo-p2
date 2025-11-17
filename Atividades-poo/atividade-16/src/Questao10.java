import java.util.TreeMap;
import java.util.Map;

public class Questao10 {
    public static void main(String[] args) {
        TreeMap<String, Integer> pessoas = new TreeMap<>();
        
        pessoas.put("Carlos", 35);
        pessoas.put("Ana", 28);
        pessoas.put("Eduardo", 42);
        pessoas.put("Beatriz", 31);
        pessoas.put("Daniel", 27);
        
        System.out.println("Pessoas e suas idades (em ordem alfabética):");
        System.out.println("---------------------------------------------");
        
        for (Map.Entry<String, Integer> entrada : pessoas.entrySet()) {
            String nome = entrada.getKey();
            Integer idade = entrada.getValue();
            System.out.println(nome + ": " + idade + " anos");
        }
        
        System.out.println("\nTotal de pessoas cadastradas: " + pessoas.size());
        System.out.println("Primeira pessoa (alfabeticamente): " + pessoas.firstKey());
        System.out.println("Última pessoa (alfabeticamente): " + pessoas.lastKey());
    }
}