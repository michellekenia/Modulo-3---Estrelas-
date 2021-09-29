package Gestao_Imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Imovel {

    private Funcionario funcionario;
    private String enderecoImovel;
    private double valorAluguel;
    private List<Morador> listaDemoradores = new ArrayList<>();

    public Imovel(String enderecoImovel, double valorAluguel) {
        this.enderecoImovel = enderecoImovel;
        this.valorAluguel = valorAluguel;
    }

    public Imovel(Funcionario funcionario, String enderecoImovel, double valorAluguel) {
        this.funcionario = funcionario;
        this.enderecoImovel = enderecoImovel;
        this.valorAluguel = valorAluguel;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getEnderecoImovel() {
        return enderecoImovel;
    }

    public void setEnderecoImovel(String enderecoImovel) {
        this.enderecoImovel = enderecoImovel;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public List<Morador> getListaDemoradores() {
        return listaDemoradores;
    }

    public void adicionarMorador(Morador novoMorador) {
        listaDemoradores.add(novoMorador);

    }

    @Override
    public String toString() {
      StringBuilder retorno = new StringBuilder();
      retorno.append("Endereço: " + enderecoImovel);
      retorno.append("Valor aluguel: " + valorAluguel);
      retorno.append("Funcionário responsável: " + funcionario);
      retorno.append("Quantidade moradores: " + listaDemoradores.size());
      retorno.append("Lista de moradores: " + listaDemoradores);
        return retorno.toString();
    }
}
