public class Veiculo {
    // atributos
    public String modelo;
    public boolean ligado;
    public int ano;
    public String cor;

    // metodos
    public void frear(Boolean frear){
        System.out.printf("O veiculo está: %b", frear);
    }

    public void correr(Boolean correr){
        System.out.printf("O veiculo está: %s", correr);
    }
}
