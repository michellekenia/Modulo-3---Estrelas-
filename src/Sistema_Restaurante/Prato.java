package Sistema_Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Prato {

    private String nome;
    private String tipo;
    private double valor;
    private List<Ingrediente> listaingredientes = new ArrayList();


    public Prato(String nome, String tipo, double valor, List<Ingrediente> listaingredientes) {
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
        this.listaingredientes = listaingredientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Ingrediente> getListaingredientes() {
        return listaingredientes;
    }

    public void setListaingredientes(List<Ingrediente> listaingredientes) {
        this.listaingredientes = listaingredientes;
    }

    public void adicionarIngredientes(Ingrediente novoingrediente) {
        listaingredientes.add(novoingrediente);
    }


    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome do prato" + nome);
        retorno.append("Tipo do prato (Vegetariano/Vegano)" + tipo);
        retorno.append("Preço do prato" + valor);
        retorno.append("Lista de ingredientes" + listaingredientes);
        return retorno.toString();
    }
}
