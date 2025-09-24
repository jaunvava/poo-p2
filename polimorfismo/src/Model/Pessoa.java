package Model;

public class Pessoa {
    private String nome;
    private String doc;

    public Pessoa(){};

    // getters e setters
    public void setName(String nome){
        this.nome = nome;
    }
    public void setDoc(String doc){
        this.doc = doc;
    }

    private String getName(){
        return this.nome;
    }

    private String getDoc(){
        String docOculto = this.doc;

        docOculto = docOculto.substring(0, 2) + "*****" + docOculto.substring(8,11);
        return docOculto;
    }

    // Metodo que pode ser sobrescrito pelas classes filhas (polimorfismo)
    public String obterTipo() {
        return "Pessoa Generica";
    }

    // Metodo que pode ser sobrescrito pelas classes filhas (polimorfismo)  
    public void apresentar() {
        System.out.println("Ola, eu sou uma " + obterTipo() + " chamada " + this.getName());
    }

    @Override
    public String toString() {
        return obterTipo() + "{" +
                "Nome='" + this.getName() + '\'' +
                ", Doc='" + this.getDoc() + '\'' +
                '}';
    }
}
