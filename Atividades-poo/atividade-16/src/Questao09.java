import java.util.HashMap;

public class Questao09 {
    public static void main(String[] args) {
        HashMap<String, Integer> pessoas = new HashMap<>();
        
        pessoas.put("João", 25);
        pessoas.put("Maria", 30);
        pessoas.put("Pedro", 28);
        
        System.out.println("Lista de pessoas cadastradas:");
        System.out.println("-----------------------------");
        for (String nome : pessoas.keySet()) {
            System.out.println(nome + ": " + pessoas.get(nome) + " anos");
        }
        
        String nomeBuscar = "João";
        
        if (pessoas.containsKey(nomeBuscar)) {
            Integer idade = pessoas.get(nomeBuscar);
            System.out.println("\nA idade de " + nomeBuscar + " é: " + idade + " anos");
        } else {
            System.out.println("\n" + nomeBuscar + " não está cadastrado.");
        }
        
        String outraPessoa = "Carlos";
        
        if (pessoas.containsKey(outraPessoa)) {
            Integer idade = pessoas.get(outraPessoa);
            System.out.println("A idade de " + outraPessoa + " é: " + idade + " anos");
        } else {
            System.out.println(outraPessoa + " não está cadastrado.");
        }
    }
}