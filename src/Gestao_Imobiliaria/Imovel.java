package Gestao_Imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Imovel {

    private String nomeFuncionario;
    private String enderecoImovel;
    private String valorAluguel;
    private List <Moradores> listaDemoradores = new ArrayList<>();

    public Imovel(String nomeFuncionario, String enderecoImovel, String valorAluguel, List<Moradores> listaDemoradores) {
        this.nomeFuncionario = nomeFuncionario;
        this.enderecoImovel = enderecoImovel;
        this.valorAluguel = valorAluguel;
        this.listaDemoradores = listaDemoradores;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getEnderecoImovel() {
        return enderecoImovel;
    }

    public void setEnderecoImovel(String enderecoImovel) {
        this.enderecoImovel = enderecoImovel;
    }

    public String getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(String valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public List<Moradores> getListaDemoradores() {
        return listaDemoradores;
    }

    public void setListaDemoradores(List<Moradores> listaDemoradores) {
        this.listaDemoradores = listaDemoradores;
    }
}
