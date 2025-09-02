import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            System.out.println("O número " + numero + " é Positivo");
        } else if (numero < 0) {
            System.out.println("O número " + numero + " é Negativo");
        } else {
            System.out.println("O número é zero (neutro)");
        }
    }
}