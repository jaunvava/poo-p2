import java.util.Scanner;

public class ConversaoDoubleSeguro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor = 0;
        while (true) {
            System.out.print("Digite um número decimal: ");
            String entrada = sc.nextLine();
            try {
                valor = Double.parseDouble(entrada);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Formato inválido! Digite um número decimal (ex: 2.5 ou 10).");
            }
        }
        System.out.println("Valor digitado: " + valor);
        sc.close();
    }
}
