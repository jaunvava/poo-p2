import java.util.Scanner;

public class Questao07 {
    public static int fatorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int numFatorial = input.nextInt();

        System.out.println(fatorial(numFatorial));
    }
}
