package TilltheFangz.api.domain.model.jogabilidade;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Inventario {
    private UUID id;
    private ArrayList<Item> itens;

    public Inventario(UUID id, ArrayList<Item> itens) {
        this.id = id;
        this.itens = itens;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    public Item  getItem(int pos) {
        return itens.get(pos);
    }
    public void setItem(Item item) {
        this.itens.add(item);
    }

    public void removeItem(Item item) {
        this.itens.remove(item);
    }
    public void addItens(ArrayList<Item> itens) {
        this.itens.addAll(itens);
    }

    public ArrayList<Item> getItens() {
        return itens;
    }
    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

}
