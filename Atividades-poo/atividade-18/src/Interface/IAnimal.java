package Interface;

public interface IAnimal {
    String getNome();
    void setNome(String nome);
    int getIdade();
    void setIdade(int idade);
    String getEspecie();
    void setEspecie(String especie);
    void emitirSom();
    void alimentar();
    String getTipoAlimentacao();
}
