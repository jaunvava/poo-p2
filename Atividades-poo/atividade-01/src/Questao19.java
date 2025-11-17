import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite sua segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite sua terçeira:");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite sua quarta nota:");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;

        System.out.println("A média das notas é: " + media);

    }
}
