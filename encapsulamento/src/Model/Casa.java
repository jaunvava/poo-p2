package Model;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    // ENCAPSULAMENTO: Atributos privados protegem o estado interno da casa
    private String endereco;
    private int numeroCasa;
    private List<Pessoa> moradores;
    private Pessoa proprietario;
    private double areaM2;
    private boolean temAlarme;
    
    // Construtor padrao
    public Casa() {
        this.moradores = new ArrayList<>();
        this.temAlarme = false;
    }
    
    // ENCAPSULAMENTO: Construtor com validacoes
    public Casa(String endereco, int numeroCasa, double areaM2) {
        this(); // Chama o construtor padrao
        this.setEndereco(endereco);
        this.setNumeroCasa(numeroCasa);
        this.setAreaM2(areaM2);
    }

    // ENCAPSULAMENTO: Getter publico para endereco
    public String getEndereco() {
        return this.endereco != null ? this.endereco : "Endereco nao informado";
    }
    
    // ENCAPSULAMENTO: Setter com validacao para endereco
    public void setEndereco(String endereco) {
        if (endereco != null && !endereco.trim().isEmpty()) {
            this.endereco = endereco.trim();
        } else {
            System.out.println("ERRO: Endereco nao pode estar vazio!");
        }
    }

    // ENCAPSULAMENTO: Getter publico para numero da casa
    public int getNumeroCasa() {
        return this.numeroCasa;
    }
    
    // ENCAPSULAMENTO: Setter com validacao para numero da casa
    public void setNumeroCasa(int numeroCasa) {
        if (numeroCasa > 0) {
            this.numeroCasa = numeroCasa;
        } else {
            System.out.println("ERRO: Numero da casa deve ser positivo!");
        }
    }

    // ENCAPSULAMENTO: Getter que retorna COPIA da lista (protege lista interna)
    public List<Pessoa> getMoradores() {
        return new ArrayList<>(this.moradores); // Retorna copia para proteger lista original
    }
    
    // ENCAPSULAMENTO: Metodo controlado para adicionar morador COM VALIDACAO
    public void adicionarMorador(Pessoa pessoa) {
        if (pessoa != null && pessoa.getNome() != null && !pessoa.getNome().equals("Nome nao informado")) {
            if (!this.moradores.contains(pessoa)) {
                this.moradores.add(pessoa);
                System.out.println("Morador " + pessoa.getNome() + " adicionado com sucesso!");
            } else {
                System.out.println("ERRO: Esta pessoa ja e moradora da casa!");
            }
        } else {
            System.out.println("ERRO: Pessoa invalida ou sem nome!");
        }
    }
    
    // ENCAPSULAMENTO: Metodo para criar e adicionar pessoa de uma vez
    public void adicionarMorador(String nome, String documento, int idade, String email) {
        Pessoa novaPessoa = new Pessoa(nome, documento, idade, email);
        this.adicionarMorador(novaPessoa);
    }

    // ENCAPSULAMENTO: Metodo controlado para remover morador
    public boolean removerMorador(Pessoa pessoa) {
        if (this.moradores.remove(pessoa)) {
            System.out.println("Morador removido com sucesso!");
            return true;
        } else {
            System.out.println("ERRO: Pessoa nao encontrada na lista de moradores!");
            return false;
        }
    }

    // ENCAPSULAMENTO: Getter para proprietario
    public Pessoa getProprietario() {
        return this.proprietario;
    }
    
    // ENCAPSULAMENTO: Setter com validacao para proprietario
    public void setProprietario(Pessoa proprietario) {
        if (proprietario != null && proprietario.isMaiorIdade()) {
            this.proprietario = proprietario;
            // Automaticamente adiciona o proprietario como morador se nao estiver
            if (!this.moradores.contains(proprietario)) {
                this.moradores.add(proprietario);
            }
            System.out.println("Proprietario definido: " + proprietario.getNome());
        } else {
            System.out.println("ERRO: Proprietario deve ser maior de idade!");
        }
    }

    // ENCAPSULAMENTO: Getter para area
    public double getAreaM2() {
        return this.areaM2;
    }
    
    // ENCAPSULAMENTO: Setter com validacao para area
    public void setAreaM2(double areaM2) {
        if (areaM2 > 0) {
            this.areaM2 = areaM2;
        } else {
            System.out.println("ERRO: Area deve ser positiva!");
        }
    }

    // ENCAPSULAMENTO: Getter para status do alarme
    public boolean isTemAlarme() {
        return this.temAlarme;
    }
    
    // ENCAPSULAMENTO: Metodos para controlar alarme
    public void ativarAlarme() {
        this.temAlarme = true;
        System.out.println("Alarme ativado na casa " + this.numeroCasa);
    }
    
    public void desativarAlarme() {
        this.temAlarme = false;
        System.out.println("Alarme desativado na casa " + this.numeroCasa);
    }

    // ENCAPSULAMENTO: Metodo publico que usa dados internos de forma controlada
    public int getQuantidadeMoradores() {
        return this.moradores.size();
    }
    
    // ENCAPSULAMENTO: Metodo que calcula informacao baseada nos dados internos
    public double calcularAreaPorPessoa() {
        if (this.moradores.size() > 0 && this.areaM2 > 0) {
            return this.areaM2 / this.moradores.size();
        }
        return 0.0;
    }
    
    // ENCAPSULAMENTO: Metodo que usa logica interna para classificar a casa
    public String classificarCasa() {
        double areaPorPessoa = calcularAreaPorPessoa();
        if (areaPorPessoa >= 50) {
            return "Casa Espaçosa";
        } else if (areaPorPessoa >= 25) {
            return "Casa Confortavel";
        } else if (areaPorPessoa > 0) {
            return "Casa Compacta";
        } else {
            return "Casa Vazia";
        }
    }
    
    // ENCAPSULAMENTO: Metodo que lista moradores de forma controlada
    public void listarMoradores() {
        if (this.moradores.isEmpty()) {
            System.out.println("Nenhum morador cadastrado.");
        } else {
            System.out.println("Moradores da casa " + this.numeroCasa + ":");
            for (int i = 0; i < this.moradores.size(); i++) {
                Pessoa morador = this.moradores.get(i);
                String status = (morador.equals(this.proprietario)) ? " (PROPRIETARIO)" : "";
                System.out.println("  " + (i+1) + ". " + morador.getNome() + status);
            }
        }
    }

    @Override
    public String toString() {
        return "Casa{" +
                "endereco='" + getEndereco() + '\'' +
                ", numero=" + getNumeroCasa() +
                ", moradores=" + getQuantidadeMoradores() +
                ", area=" + getAreaM2() + "m²" +
                ", proprietario=" + (proprietario != null ? proprietario.getNome() : "Nao definido") +
                ", alarme=" + (temAlarme ? "Ativo" : "Inativo") +
                ", classificacao='" + classificarCasa() + '\'' +
                '}';
    }
}
