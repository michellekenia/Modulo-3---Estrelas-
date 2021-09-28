package Funcionarios_Universidade;

public class Administrativo extends Funcionarios {

    private String funcao;
    private String senioridade;

    public Administrativo(String nome, String cpf, int numeroDeRegistro, String orgaoDeLotacao, double salario, String funcao, String senioridade) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.funcao = funcao;
        this.senioridade = senioridade;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }


    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }
}
