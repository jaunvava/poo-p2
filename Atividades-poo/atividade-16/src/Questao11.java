import java.util.HashMap;
import java.util.Map;

// Classe Pessoa com atributos nome e idade
class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + " anos";
    }
}

public class Questao11 {
    public static void main(String[] args) {
        HashMap<String, Pessoa> mapaPessoas = new HashMap<>();
        
        Pessoa pessoa1 = new Pessoa("João", 25);
        Pessoa pessoa2 = new Pessoa("Maria", 30);
        Pessoa pessoa3 = new Pessoa("Pedro", 28);
        
        mapaPessoas.put(pessoa1.getNome(), pessoa1);
        mapaPessoas.put(pessoa2.getNome(), pessoa2);
        mapaPessoas.put(pessoa3.getNome(), pessoa3);
        
        System.out.println("Pessoas cadastradas no HashMap:");
        System.out.println("================================");
        
        for (Map.Entry<String, Pessoa> entrada : mapaPessoas.entrySet()) {
            String chave = entrada.getKey();
            Pessoa pessoa = entrada.getValue();
            System.out.println("Chave: " + chave + " -> " + pessoa);
        }
        
        System.out.println("\nBuscando informações de Maria:");
        System.out.println("------------------------------");
        if (mapaPessoas.containsKey("Maria")) {
            Pessoa maria = mapaPessoas.get("Maria");
            System.out.println(maria);
            System.out.println("Idade de Maria: " + maria.getIdade() + " anos");
        }
    }
}