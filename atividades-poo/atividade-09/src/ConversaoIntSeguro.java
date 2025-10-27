import java.util.Scanner;

public class ConversaoIntSeguro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        String entrada = sc.nextLine();
        try {
            int valor = Integer.parseInt(entrada);
            System.out.println("Valor digitado: " + valor);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Digite um número inteiro.");
        }
        sc.close();
    }
}
