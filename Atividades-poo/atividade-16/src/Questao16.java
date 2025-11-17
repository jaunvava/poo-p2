import java.util.TreeSet;
import java.util.Set;

public class Questao16 {
    public static void main(String[] args) {
        Set<String> frutas = new TreeSet<>();
        
        String[] frutasArray = {"Maçã", "Banana", "Laranja", "Uva", "Banana", "Maçã", "Pera"};
        
        System.out.println("Adicionando frutas:");
        for (String fruta : frutasArray) {
            if (frutas.add(fruta)) {
                System.out.println("Adicionado: " + fruta);
            } else {
                System.out.println("Duplicata ignorada: " + fruta);
            }
        }
        
        System.out.println("\nFrutas em ordem alfabética: " + frutas);
    }
}