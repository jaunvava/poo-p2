package Model;

public class Visitante extends Pessoa {
    private String motivo;
    private String empresaOrigem;
    private boolean temAutorizacao;

    public Visitante() {
        super();
        this.motivo = "Visita geral";
        this.empresaOrigem = "Nao informado";
        this.temAutorizacao = false;
    }

    public Visitante(String nome, String doc, String motivo, String empresaOrigem) {
        super();
        this.setName(nome);
        this.setDoc(doc);
        this.motivo = motivo;
        this.empresaOrigem = empresaOrigem;
        this.temAutorizacao = false;
    }

    // Polimorfismo: sobrescrevendo o metodo da classe pai
    @Override
    public String obterTipo() {
        return "Visitante" + (temAutorizacao ? " Autorizado" : " Nao Autorizado");
    }

    // Polimorfismo: sobrescrevendo o metodo da classe pai
    @Override
    public void apresentar() {
        System.out.println("Ola! Sou um visitante da empresa " + empresaOrigem + 
                          ", me chamo " + this.toString().split("'")[1] + 
                          " e vim aqui para: " + motivo);
    }

    // Metodos especificos da classe Visitante
    public void solicitarAutorizacao() {
        System.out.println("Visitante " + this.toString().split("'")[1] + 
                          " esta solicitando autorizacao para entrar.");
        System.out.println("Motivo: " + motivo);
        System.out.println("Empresa: " + empresaOrigem);
    }

    public void concederAutorizacao() {
        this.temAutorizacao = true;
        System.out.println("Autorizacao concedida para " + this.toString().split("'")[1]);
    }

    public void revogarAutorizacao() {
        this.temAutorizacao = false;
        System.out.println("Autorizacao revogada para " + this.toString().split("'")[1]);
    }

    public boolean podeEntrar() {
        return temAutorizacao;
    }

    // Getters e Setters
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEmpresaOrigem() {
        return empresaOrigem;
    }

    public void setEmpresaOrigem(String empresaOrigem) {
        this.empresaOrigem = empresaOrigem;
    }

    public boolean isTemAutorizacao() {
        return temAutorizacao;
    }

    public void setTemAutorizacao(boolean temAutorizacao) {
        this.temAutorizacao = temAutorizacao;
    }
}