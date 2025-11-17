import java.util.Scanner;

public class MediaNotasSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[3];
        boolean erro = false;
        try {
            for (int i = 0; i < 3; i++) {
                System.out.print("Digite a nota " + (i+1) + ": ");
                String entrada = sc.nextLine();
                try {
                    notas[i] = Double.parseDouble(entrada);
                } catch (NumberFormatException e) {
                    System.out.println("Erro: Valor inválido! Digite apenas números (ex: 7.5 ou 10)." );
                    erro = true;
                    break;
                }
                if (notas[i] < 0 || notas[i] > 10) {
                    throw new IllegalArgumentException("Nota inválida! As notas devem estar entre 0 e 10.");
                }
            }
            if (!erro) {
                double media = (notas[0] + notas[1] + notas[2]) / 3.0;
                System.out.printf("Média: %.2f\n", media);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Fim do cálculo.");
            sc.close();
        }
    }
}
