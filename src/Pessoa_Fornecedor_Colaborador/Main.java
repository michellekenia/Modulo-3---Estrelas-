package Pessoa_Fornecedor_Colaborador;

public class Main {
    public static void main(String[] args) {

        Fornecedor fornecedor = new Fornecedor("Maria", "Rua Antonia, 222", "999999", 3000, 1000);
        Colaborador colaborador = new Colaborador("Ana", "Rua Antonieta, 222", "11111111", 40, 5000, 500);
        Administrador admnistrador = new Administrador("Alice", "Rua Anitta, 777", "12121212", 15, 6000, 600, 700);

        //Testando Fornecedor
        System.out.println("Dados Fornecedor: ");
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Saldo: " + fornecedor.ObterSaldo());
        System.out.println();

        //Testando Colaborador
        System.out.println("Dados Colaborador: ");
        System.out.println("Nome: " + colaborador.getNome());
        System.out.println("Endereço: " + colaborador.getEndereco());
        System.out.println("Telefone: " + colaborador.getTelefone());
        System.out.println("Salário: " + colaborador.CalcularSalario());
        System.out.println();

        //Testando Admistrador
        System.out.println("Dados Administrador: ");
        System.out.println("Nome: " + admnistrador.getNome());
        System.out.println("Endereço: " + admnistrador.getEndereco());
        System.out.println("Telefone: " + admnistrador.getTelefone());
        System.out.println("Salário: " + admnistrador.CalcularSalario());
        System.out.println();
    }
}
