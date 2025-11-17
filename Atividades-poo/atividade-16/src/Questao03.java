import java.util.HashSet;
import java.util.Set;

public class Questao03 {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        
        numeros.add(10);
        numeros.add(20);
        numeros.add(10);
        numeros.add(30);
        numeros.add(40);
        
        System.out.println("Números no conjunto (sem duplicatas):");
        System.out.println(numeros);
    }
}
