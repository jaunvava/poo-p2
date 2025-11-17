import java.util.LinkedList;

public class Questao12 {
    public static void main(String[] args) {
        LinkedList<Integer> numeros = new LinkedList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        
        System.out.println("Lista original:");
        System.out.println(numeros);
        
        numeros.addFirst(0);
        
        System.out.println("\nApós adicionar 0 no início:");
        System.out.println(numeros);
        
        numeros.addLast(6);
        
        System.out.println("\nApós adicionar 6 no final:");
        System.out.println(numeros);
        
        System.out.println("\nImprimindo elemento por elemento:");
        for (Integer numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
        
        System.out.println("\nInformações da lista:");
        System.out.println("Tamanho: " + numeros.size());
        System.out.println("Primeiro elemento: " + numeros.getFirst());
        System.out.println("Último elemento: " + numeros.getLast());
    }
}