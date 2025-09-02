import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        System.out.println();
        System.out.println("Classificações do número " + numero + ":");

        if (numero == 0) {
            System.out.println("- Zero");
            System.out.println("- Par");
        } else {
            if (numero > 0) {
                System.out.println("- Positivo");
            } else {
                System.out.println("- Negativo");
            }
            if (numero % 2 == 0) {
                System.out.println("- Par");
            } else {
                System.out.println("- Ímpar");
            }
        }
    }
}