package Gestao_Imobiliaria;

public class Funcionario extends Pessoa {

    private String CTPS;

    public Funcionario(String nome, String cpf, String CTPS) {
        super(nome, cpf);
        this.CTPS = CTPS;
    }

    public String getCTPS() {
        return CTPS;
    }

    public void setCTPS(String CTPS) {
        this.CTPS = CTPS;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append(super.toString());
        retorno.append ("Carteira de trabalho: " + CTPS);
        return retorno.toString();

    }
}
