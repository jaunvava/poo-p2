import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
    
    @Override
    public String toString() {
        return nome + " (" + idade + " anos)";
    }
}

public class Questao13 {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        
        pessoas.add(new Pessoa("Carlos", 35));
        pessoas.add(new Pessoa("Ana", 22));
        pessoas.add(new Pessoa("Beatriz", 28));
        pessoas.add(new Pessoa("Daniel", 19));
        pessoas.add(new Pessoa("Eduardo", 41));
        
        System.out.println("Lista original (ordem de inserção):");
        System.out.println("====================================");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
        
        Collections.sort(pessoas, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa p1, Pessoa p2) {
                return Integer.compare(p1.getIdade(), p2.getIdade());
            }
        });
        
        System.out.println("\nLista ordenada por idade (crescente):");
        System.out.println("======================================");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
        
        System.out.println("\n--- Exemplo com Lambda ---");
        
        pessoas.sort((p1, p2) -> Integer.compare(p1.getIdade(), p2.getIdade()));
        
        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade));
        
        System.out.println("Lista ordenada (usando lambda):");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}