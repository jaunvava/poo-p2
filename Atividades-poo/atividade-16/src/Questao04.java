import java.util.HashSet;
import java.util.Set;

public class Questao04 {
    public static void main(String[] args) {

        Set<String> cidades = new HashSet<>();

        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Belo Horizonte");
        cidades.add("Salvador");
        cidades.add("Recife");
      
        System.out.println("Lista de cidades:");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }
    }
}
