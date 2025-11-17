package View;

import java.util.Scanner;

public class App {

    public static void menu(){

        System.out.println("=============== Menu ===============");
        System.out.println("1 - Criar Pessoa");
        System.out.println("2 - Criar Pessoa");
        System.out.print("Opção: ");
    }

    public static String getOp(){

        Scanner input = new Scanner(System.in);
        return input.next();

    }
}