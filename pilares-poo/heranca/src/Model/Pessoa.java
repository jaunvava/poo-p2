package Model;

abstract public class Pessoa {
    private String nome;
    private String doc;

    public Pessoa(){}

    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(int doc){
        this.doc = String.format("%d", doc);
    }

    protected Pessoa(String nome, String doc ){
        this.nome = nome;
        this.doc = doc;
    }

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

    // Método abstrato que deve ser implementado pelas classes filhas
    public abstract String obterTipo();

    // Método abstrato para calcular valor específico de cada tipo de pessoa
    public abstract double calcularValorMensal();

    @Override
    public String toString() {
        return String.format("nome=%s, doc=%s",
                this.getName(),
                this.getDoc());
    }
}
