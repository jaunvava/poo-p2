import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite seu nome: ");
        String original = input.next();
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println("Nome original: " + original);
        System.out.println("Nome invertido: " + reversed);
    }
}