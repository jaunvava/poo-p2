import java.util.LinkedList;
import java.util.Queue;

public class Questao14 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        
        for (int i = 1; i <= 5; i++) {
            fila.offer(i);
        }
        
        System.out.println("Elemento na frente: " + fila.peek());
        
        while (!fila.isEmpty()) {
            System.out.println("Removendo: " + fila.poll());
        }
    }
}