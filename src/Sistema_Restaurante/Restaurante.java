package Sistema_Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {

    private String nome;
    private List<Prato> listaDePratos = new ArrayList<>();

    public Restaurante(String nome, List<Prato> listaDePratos) {
        this.nome = nome;
        this.listaDePratos = listaDePratos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Prato> getListaDePratos() {
        return listaDePratos;
    }

    public void setListaDePratos(List<Prato> listaDePratos) {
        this.listaDePratos = listaDePratos;
    }

    public void adicionarPratos(Prato novoprato) {
        listaDePratos.add(novoprato;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome do restaurante: " + nome);
        retorno.append("Lista de pratos: " + listaDePratos);
        return retorno.toString();
    }
}
