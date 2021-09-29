package Gestao_Imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {

    List<Imovel> imoveis = new ArrayList<>();

    public void adicionarImovel (Imovel imovel) {
        imoveis.add(imovel);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Quantidade de imóveis": imoveis.size());
        retorno.append("Imóveis: " + imoveis);
        return retorno.toString();
    }
}
