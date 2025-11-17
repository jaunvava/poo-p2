import java.util.LinkedHashMap;
import java.util.Map;

public class Questao018 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> pessoas = new LinkedHashMap<>();
        
        System.out.println("=== ADICIONANDO ELEMENTOS ===");
        pessoas.put("Ana", 25);
        System.out.println("Adicionado: Ana - 25 | Mapa: " + pessoas);
        
        pessoas.put("Carlos", 30);
        System.out.println("Adicionado: Carlos - 30 | Mapa: " + pessoas);
        
        pessoas.put("Beatriz", 22);
        System.out.println("Adicionado: Beatriz - 22 | Mapa: " + pessoas);
        
        pessoas.put("Daniel", 35);
        System.out.println("Adicionado: Daniel - 35 | Mapa: " + pessoas);
        
        pessoas.put("Eduardo", 28);
        System.out.println("Adicionado: Eduardo - 28 | Mapa: " + pessoas);
        
        System.out.println("\n=== MAPA COMPLETO ===");
        System.out.println("LinkedHashMap: " + pessoas);
        System.out.println("Tamanho: " + pessoas.size());
        
        System.out.println("\n=== REMOVENDO O PRIMEIRO ELEMENTO ===");
        Integer idadeRemovida = pessoas.remove("Ana");
        System.out.println("Removido: Ana - " + idadeRemovida + " anos");
        
        System.out.println("\n=== MAPA APÓS REMOÇÃO ===");
        System.out.println("LinkedHashMap: " + pessoas);
        System.out.println("Tamanho: " + pessoas.size());
        
        System.out.println("\n=== ORDEM DE ITERAÇÃO ===");
        System.out.println("Percorrendo o LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : pessoas.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Idade: " + entry.getValue());
        }
        
        System.out.println("\n=== OPERAÇÕES ADICIONAIS ===");
        System.out.println("Contém chave 'Carlos'? " + pessoas.containsKey("Carlos"));
        System.out.println("Contém valor 22? " + pessoas.containsValue(22));
        System.out.println("Idade de Beatriz: " + pessoas.get("Beatriz"));
        
        System.out.println("\n=== TESTANDO CHAVE DUPLICADA ===");
        Integer valorAnterior = pessoas.put("Carlos", 32); // Carlos já existe
        System.out.println("Valor anterior de Carlos: " + valorAnterior);
        System.out.println("Novo valor de Carlos: " + pessoas.get("Carlos"));
        System.out.println("Mapa atualizado: " + pessoas);
    }
}