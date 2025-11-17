import java.util.HashSet;
import java.util.Set;

public class Questao05 {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);
        
        int numeroBusca = 15;
        boolean existe = numeros.contains(numeroBusca);
        
        if (existe) {
            System.out.println("O número " + numeroBusca + " está presente no conjunto");
        } else {
            System.out.println("O número " + numeroBusca + " não está presente no conjunto");
        }
    }
}
