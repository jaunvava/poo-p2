import java.util.Scanner;

public class Questao06 {
    public static int somaAte(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int num = input.nextInt();

        System.out.println(somaAte(num));
    }
}
