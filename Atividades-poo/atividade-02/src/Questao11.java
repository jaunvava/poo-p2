import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Salário atual: R$ ");
        double salario = scanner.nextDouble();

        System.out.print("Anos de trabalho: ");
        int anos = scanner.nextInt();

        double bonus;

        if (anos > 5) {
            bonus = salario * 0.20;
        } else if (anos >= 3) {
            bonus = salario * 0.15;
        } else {
            bonus = salario * 0.10;
        }

        System.out.printf("\nBônus: R$ %.2f%n", bonus);
        System.out.printf("Novo salário: R$ %.2f%n", salario + bonus);
    }
}