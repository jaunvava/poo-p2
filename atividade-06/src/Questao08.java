import java.util.Scanner;

public class Questao08 {
    public static boolean ePrimo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int num1 = input.nextInt();

        System.out.printf("Digite um segundo número: ");
        int num2 = input.nextInt();

        System.out.println(ePrimo(num1));
        System.out.println(ePrimo(num2));
    }
}
