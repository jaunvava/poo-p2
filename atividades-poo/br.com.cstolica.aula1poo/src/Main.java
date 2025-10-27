public class Main {
    public static void main(String[] args) {

        // class pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "joao";
        pessoa.altura = 1.80;
        pessoa.idade = 24;


        // class animal
        Animal animal = new Animal();
        animal.nome = "mike";
        animal.tipoAnimal = "cachorro";
        animal.sexo = "masculino";
        animal.idade = 5;


        // class veiculo
        Veiculo carro = new Veiculo();
        carro.ano = 2025;
        carro.cor = "azul";
        carro.modelo = "Polo";

        Casa casa = new Casa();
        casa.vetorDePessoas[0] = pessoa1;
        casa.vetorDeVeiculos[0] = animal1;
        casa.vetorDeAnimais[0] = animal1;


    }
}
