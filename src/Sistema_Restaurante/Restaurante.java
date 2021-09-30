package Sistema_Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {

    private List<Prato> listaDePratos = new ArrayList<>();

    public Restaurante() {
    }

    public Restaurante(List<Prato> listaDePratos) {
        this.listaDePratos = listaDePratos;
    }

    public List<Prato> getListaDePratos() {
        return listaDePratos;
    }

    public void setListaDePratos(List<Prato> listaDePratos) {
        this.listaDePratos = listaDePratos;
    }

    public void adicionarPratos(Prato novoprato) {
        listaDePratos.add(novoprato);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Lista de pratos: " + listaDePratos);
        return retorno.toString();
    }
}
