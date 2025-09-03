import java.util.Scanner;

public class Questao03 {
    public static int maior(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o primeiro número inteiro: ");
        int num1 = input.nextInt();

        System.out.printf("Digite segundo número inteiro: ");
        int num2 = input.nextInt();

        System.out.println("O maior número inteiro e: " + maior(num1, num2));
    }
}
