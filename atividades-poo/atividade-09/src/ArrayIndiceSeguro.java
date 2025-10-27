import java.util.Scanner;

public class ArrayIndiceSeguro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite um número: ");
            int num = Integer.parseInt(sc.nextLine());
            int[] arr = new int[1];
            arr[0] = num * 2;
            System.out.print("Digite o índice para acessar o array: ");
            int idx = Integer.parseInt(sc.nextLine());
            System.out.println("Valor no índice " + idx + ": " + arr[idx]);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada não numérica!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice inválido!");
        }
        sc.close();
    }
}
