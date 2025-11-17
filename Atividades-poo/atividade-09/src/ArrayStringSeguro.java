import java.util.Scanner;

public class ArrayStringSeguro {
    public static void main(String[] args) {
        String[] palavras = {"Java", null, "Tratamento"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o índice para acessar o array: ");
        int idx = sc.nextInt();
        try {
            System.out.println("Tamanho da string: " + palavras[idx].length());
        } catch (NullPointerException e) {
            System.out.println("A string na posição [" + idx + "] é nula!");
        } finally {
            System.out.print("Conteúdo do array: ");
            for (String s : palavras) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
