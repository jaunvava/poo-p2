import java.util.ArrayDeque;
import java.util.Deque;

public class Questao15 {
    public static void main(String[] args) {
        Deque<String> pilha = new ArrayDeque<>();
        
        String[] valores = {"A", "B", "C", "D"};
        System.out.println("Empilhando elementos:");
        
        for (String valor : valores) {
            pilha.push(valor);
            System.out.println("Empilhado: " + valor + " - Pilha: " + pilha);
        }
        
        System.out.println("\nTopo da pilha: " + pilha.peek());
        
        System.out.println("\nDesempilhando elementos (LIFO):");
        while (!pilha.isEmpty()) {
            String elemento = pilha.pop();
            System.out.println("Desempilhado: " + elemento + " - Pilha: " + pilha);
        }
    }
}