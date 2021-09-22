package ListaModelagemDeClasses_ContaBancária;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Michelle", "3232x", 1212, 2000);

        // Testando método extrato
        conta.extrato();

        //Testanto médodo saque
        System.out.println();
        conta.saque(500);
        System.out.println("Saldo após sacar");
        conta.extrato();

        //Testando método depósito
        System.out.println();
        conta.deposito(4000);
        System.out.println("Saldo após depósito");
        conta.extrato();


    }
}
