import java.util.ArrayList;

public class Questao01 {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("maçã");
        frutas.add("banana");
        frutas.add("laranja");
        frutas.add("abacaxi");
        
        String elementoBusca = "banana";
        int posicao = frutas.indexOf(elementoBusca);
        
        if (posicao != -1) {
            System.out.println("O elemento '" + elementoBusca + "' foi encontrado na posição " + posicao);
        } else {
            System.out.println("O elemento '" + elementoBusca + "' não foi encontrado na lista");
        }
    }
}