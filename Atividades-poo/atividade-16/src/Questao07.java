import java.util.HashSet;

public class Questao07 {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);
        
        System.out.println("Elementos no conjunto:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        
        int numeroParaVerificar = 15;
        if (numeros.contains(numeroParaVerificar)) {
            System.out.println("\nO número " + numeroParaVerificar + " está presente no conjunto.");
        } else {
            System.out.println("\nO número " + numeroParaVerificar + " NÃO está presente no conjunto.");
        }
        
        int outroNumero = 30;
        if (numeros.contains(outroNumero)) {
            System.out.println("O número " + outroNumero + " está presente no conjunto.");
        } else {
            System.out.println("O número " + outroNumero + " NÃO está presente no conjunto.");
        }
    }
}