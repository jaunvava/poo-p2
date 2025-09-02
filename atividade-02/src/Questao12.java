import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        if (numero <= 1) {
            System.out.println(numero + " não é primo");
        } else {
            boolean ePrimo = true;

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    ePrimo = false;
                    break;
                }
            }
            System.out.println(numero + (ePrimo ? " é primo" : " não é primo"));
        }
    }
}