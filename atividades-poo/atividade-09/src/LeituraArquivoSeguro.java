import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraArquivoSeguro {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("dados.txt"));
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        } finally {
            System.out.println("Fim da operação de leitura.");
            if (sc != null) sc.close();
        }
    }
}
