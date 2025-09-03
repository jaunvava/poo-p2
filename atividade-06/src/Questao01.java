import java.util.Scanner;

public class Questao01 {
    public static boolean ePar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite número 1: ");
        int num1 = input.nextInt();

        System.out.printf("Digite número 2: ");
        int num2 = input.nextInt();

        System.out.println(ePar(num1));
        System.out.println(ePar(num2));
    }
}
