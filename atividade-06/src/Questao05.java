import java.util.Scanner;

public class Questao05 {
    public static String saudacao(String nome) {
        return "Olá, " + nome + "Seja bem vindo(a) a isntituição!";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite seu nome: ");
        String nome = input.next();

        System.out.println(saudacao(nome));
    }
}
