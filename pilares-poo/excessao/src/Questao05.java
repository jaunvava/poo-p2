import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string (ou deixe em branco para simular null): ");
        String texto = scanner.nextLine();

        if (texto.isEmpty()) {
            texto = null;
        }

        try {
            System.out.println("Comprimento: " + texto.length());
        } catch (NullPointerException e) {
            System.out.println("Erro: A string é null.");
        } finally {
            scanner.close();
        }
    }
}
