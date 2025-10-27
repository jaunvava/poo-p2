package br.com.cz.delivery.model.restaurante;

import br.com.cz.delivery.contracts.ICRUD;

import java.util.ArrayList;

public class Cardapio implements ICRUD {
    private ArrayList<ItemCardapio> items;

    Cardapio(){
        items = new ArrayList<>();
    }

    @Override
    public boolean inserir(Object obj) {
        ItemCardapio item = (ItemCardapio) obj;
        return items.add(item);
    }

    @Override
    public Object retornarPorId(int id) {
        for (int i = 0; i < this.items.size(); i++){
            if (this.items.get(i).getId() == id){
                return this.items.get(i);
            }
        }
        return null;
    }

    @Override
    public boolean atualizar(int id, Object obj) {
        for (int i = 0; i < this.items.size(); i++){
            if (this.items.get(i).getId() == id){
                this.items.set(i, (ItemCardapio) obj);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removerPorId(int id) {
        for (int i = 0; i < this.items.size(); i++){
            if (this.items.get(i).getId() == id){
                this.items.set(i, null);
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Object> retornarTodos() {
        ArrayList<Object> items = new ArrayList<>();
        items.addAll(this.items);
        return items;
    }

    @Override
    public ArrayList<Object> buscarPorNome(String nome) {
        ArrayList<Object> items = new ArrayList<>();

        for (int i = 0; i < this.items.size(); i++){
            if (this.items.get(i).getNome().equalsIgnoreCase(nome)){
                items.add(this.items.get(i));
            }
        }
        return items;
    }
}
