public class Animal {
    // atributos
    public String nome;
    public int idade;
    public String sexo;
    public String tipoAnimal;

    // metodos
    public void andar(){
        System.out.println("Andando");
    }

    public void comer(String comida){
        System.out.printf("Comendo %s", comida);
    }
}