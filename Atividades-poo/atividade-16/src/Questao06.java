import java.util.HashSet;

public class Questao06 {
    public static void main(String[] args) {
        HashSet<String> cidades = new HashSet<>();
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Brasília");
        cidades.add("Salvador");
        cidades.add("Fortaleza");
        
        System.out.println("Cidades no conjunto:");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }
    }
}