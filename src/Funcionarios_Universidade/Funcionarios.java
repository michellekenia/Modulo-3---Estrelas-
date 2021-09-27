package Funcionarios_Universidade;

public class Funcionarios {
    private String nome;
    private String cpf;
    private int numeroDeRegistro;
    private String localDeTrabalho;
    private double orgaoDeLotacao;

    public Funcionarios(String nome, String cpf, int numeroDeRegistro, String localDeTrabalho, double orgaoDeLotacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroDeRegistro = numeroDeRegistro;
        this.localDeTrabalho = localDeTrabalho;
        this.orgaoDeLotacao = orgaoDeLotacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(int numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public String getLocalDeTrabalho() {
        return localDeTrabalho;
    }

    public void setLocalDeTrabalho(String localDeTrabalho) {
        this.localDeTrabalho = localDeTrabalho;
    }

    public double getOrgaoDeLotacao() {
        return orgaoDeLotacao;
    }

    public void setOrgaoDeLotacao(double orgaoDeLotacao) {
        this.orgaoDeLotacao = orgaoDeLotacao;
    }
}
