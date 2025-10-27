import java.util.Scanner;

public class AcessoArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite o índice para acessar o array: ");
            int idx = sc.nextInt();
            System.out.println("Valor: " + arr[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora do limite do array!");
        }
        sc.close();
    }
}
