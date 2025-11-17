package br.com.cz.delivery.model.restaurante;

public class ItemCardapio {
    private int id;
    private String nome;
    private int preco;
    private String descricao;
    private static int NEXT_ID = 0;

    public ItemCardapio(
            String nome,
            int preco,
            String descricao
    ){
        NEXT_ID++;
        this.id = NEXT_ID;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;

    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "ItemCardapio{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
