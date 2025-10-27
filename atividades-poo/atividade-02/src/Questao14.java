import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a idade do atleta: ");
        int idade = scanner.nextInt();

        if (idade < 5) {
            System.out.println("Idade inválida! A idade mínima é 5 anos.");
        } else {
            if (idade <= 12) {
                System.out.println("Categoria: Infantil (5 a 12 anos)");
            } else if (idade <= 17) {
                System.out.println("Categoria: Juvenil (13 a 17 anos)");
            } else if (idade <= 40) {
                System.out.println("Categoria: Adulto (18 a 40 anos)");
            } else {
                System.out.println("Categoria: Master (acima de 40 anos)");
            }
        }
    }
}