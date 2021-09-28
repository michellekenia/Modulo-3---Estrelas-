package Gestao_Imobiliaria;

public class Moradores {

    private String nome;
    private String cpf;
    private String telefone;
    private String codigoimovel;

    public Moradores(String nome, String cpf, String telefone, String codigoimovel) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.codigoimovel = codigoimovel;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCodigoimovel() {
        return codigoimovel;
    }

    public void setCodigoimovelAlugado(String codigoimovelAlugado) {
        this.codigoimovel= codigoimovelAlugado;
    }
}
