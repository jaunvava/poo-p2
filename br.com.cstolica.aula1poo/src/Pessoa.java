public class Pessoa {
    // atributos
    public String nome;
    public int idade;
    public String genero;
    public double altura;
    public  String numeroDoc;

    // metodos
    public void andar(){
        System.out.println("Anadando");
    }

    public void comer(String comida){
        System.out.printf("Comendo %s", comida);
    }

    public void falar(String conversa){
        System.out.printf("%s: %s", this.nome, conversa);
    }

    @Override
    public String toString(){
        return String.format("<Pessoa: nome=%s, idade=%d, genero=%s, altura=%d, numeroDoc=%s>", nome, idade,genero, altura,numeroDoc );
    }
}
