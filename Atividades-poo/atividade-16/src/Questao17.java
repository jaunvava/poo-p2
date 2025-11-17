import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class Questao17 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        
        String[] palavras = {"zebra", "abelha", "cachorro", "gato", "elefante"};
        
        for (String palavra : palavras) {
            hashSet.add(palavra);
            treeSet.add(palavra);
        }
        
        System.out.println("HashSet (ordem imprevisível): " + hashSet);
        System.out.println("TreeSet (ordem alfabética):   " + treeSet);
    }
}