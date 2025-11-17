import java.io.*;

public class ConfigArquivoSeguro {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            File file = new File("config.txt");
            if (!file.exists()) throw new FileNotFoundException();
            br = new BufferedReader(new FileReader(file));
            String linha;
            while (true) {
                try {
                    linha = br.readLine();
                    if (linha == null) break;
                    System.out.println(linha);
                } catch (IOException e) {
                    System.out.println("Erro ao ler o arquivo.");
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo 'config.txt' não encontrado. Criando um novo...");
            try {
                new File("config.txt").createNewFile();
            } catch (IOException ex) {
                System.out.println("Erro ao criar o arquivo.");
            }
        } finally {
            System.out.println("Processo finalizado.");
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Erro ao fechar o arquivo.");
            }
        }
    }
}
