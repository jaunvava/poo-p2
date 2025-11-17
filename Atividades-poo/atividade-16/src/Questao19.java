import java.util.ArrayList;
import java.util.List;

public class Questao19 {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        lista1.add(10);
        lista1.add(20);
        lista1.add(30);
        
        List<Integer> lista2 = new ArrayList<>();
        lista2.add(40);
        lista2.add(50);
        lista2.add(60);
        
        List<Integer> listaUnida = new ArrayList<>();
        listaUnida.addAll(lista1);
        listaUnida.addAll(lista2);
        
        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        System.out.println("Lista unida: " + listaUnida);
    }
}