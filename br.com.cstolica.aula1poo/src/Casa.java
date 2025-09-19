public class Casa {
    // atributos
    public Pessoa[] listaPessoas;
    public Veiculo[] listaVeiculos;
    public Animal[] listaAnimais;

    public Casa(){}

    public Casa(int quantPessoas, int quantVeiculos, int quantAnimais){
        Pessoa[] vetorDePessoas = new Pessoa[quantPessoas];
        Veiculo[] vetorDeVeiculos = new Veiculo[quantVeiculos];
        Animal[] vetorDeAnimais = new Animal[quantAnimais];
    }
}