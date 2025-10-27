import java.util.ArrayList;

public class AmbienteAquatico extends Ambiente {
    private int capacidade;
    private String localizacao;
    private String clima;
    private String horario;
    private ArrayList<Animal> animais;

    public AmbienteAquatico(String nome, int capacidade, String localizacao, String clima, String horario) {
        super(nome, "Aquático");
        this.capacidade = capacidade;
        this.localizacao = localizacao;
        this.clima = clima;
        this.horario = horario;
        this.animais = new ArrayList<>();
    }
    public void adicionarAnimal(Animal animal) {
        if (animais.size() < capacidade) {
            animais.add(animal);
        }
    }
    public ArrayList<Animal> getAnimais() { return animais; }
}
