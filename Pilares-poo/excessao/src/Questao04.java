import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo: ");
        String nomeArquivo = scanner.nextLine();

        try (Scanner leitor = new Scanner(new File(nomeArquivo))) {
            while (leitor.hasNextLine()) {
                System.out.println(leitor.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro: Arquivo não encontrado ou não pode ser lido.");
        } finally {
            scanner.close();
        }
    }
}
