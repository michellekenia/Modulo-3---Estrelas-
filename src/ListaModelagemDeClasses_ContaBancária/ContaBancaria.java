package ListaModelagemDeClasses_ContaBancária;
/*
Crie uma classe conta bancária com os atributos: agência, número, saldo e o nome do correntista.
Crie também o método saque() que serve para retirar certo valor do saldo.
Crie o método depósito() que serve para adicionar um valor ao saldo.
Crie o método extrato() que serve para mostrar na tela o nome do correntista,
o número da conta e o saldo.
Crie um programa principal e demonstre a utilização dos métodos implementados.
 */

public class ContaBancaria {
    String nome;
    String agencia;
    int numero;
    double saldo;

    public ContaBancaria(String nome, String agencia, int numero, double saldo) {
        this.nome = nome;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void saque(double valorDoSaque) {
        saldo = saldo - valorDoSaque;

    }

    public void deposito(double valorDepositado) {
        saldo = saldo + valorDepositado;
    }

    public void extrato() {
        System.out.println("Extrato bancário");
        System.out.println("Nome: " + nome);
        System.out.println("Agência: " + agencia);
        System.out.println("Conta Corrente: " + numero);
        System.out.println("Saldo: " + saldo);
    }


}
