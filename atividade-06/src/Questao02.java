import java.util.Scanner;

public class Questao02 {
    public static int dobro(int numero) {
        return numero * 2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite número 1: ");
        int num1 = input.nextInt();

        System.out.printf("Digite número 2: ");
        int num2 = input.nextInt();

        System.out.println("o dobro de: " + num1 + " e -> " + dobro(num1));
        System.out.println("o dobro de: " + num2 + " e -> " + dobro(num2));
    }
}
