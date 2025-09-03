import java.util.Scanner;
import java.util.SortedMap;

public class Questao04 {
    public static void tabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o número para tabuada: ");
        int num = input.nextInt();

        tabuada(num);
    }
}
