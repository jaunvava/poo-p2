import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite três números inteiros:");
        System.out.print("Primeiro número: ");
        int a = scanner.nextInt();
        
        System.out.print("Segundo número: ");
        int b = scanner.nextInt();

        System.out.print("Terceiro número: ");
        int c = scanner.nextInt();
        int menor, meio, maior;
        
        if (a <= b && a <= c) {
            menor = a;
            if (b <= c) {
                meio = b;
                maior = c;
            } else {
                meio = c;
                maior = b;
            }
        } else if (b <= a && b <= c) {
            menor = b;
            if (a <= c) {
                meio = a;
                maior = c;
            } else {
                meio = c;
                maior = a;
            }
        } else {
            menor = c;
            if (a <= b) {
                meio = a;
                maior = b;
            } else {
                meio = b;
                maior = a;
            }
        }
        System.out.println("\nNúmeros em ordem crescente:");
        System.out.println(menor + ", " + meio + ", " + maior);
    }
}