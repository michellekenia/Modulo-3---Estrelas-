package Gestao_Imobiliaria;

import java.util.Scanner;

public class Sistema {

    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    // Exibir possibilidades do menu
    public static void menu() {
        System.out.println("Você está no SIIS - Sistema Da Imobiliária Soares");
        System.out.println("Digite 1 - Para cadastrar um imóvel.");
        System.out.println("Digite 2 - Para exibir os imóveis cadastrados.");
        System.out.println("Digite 3 - Para sair.");
    }

    // Método responsável por cadastrar moradores
    public static Morador cadastrarMoradores() {
        String nome = capturarDados("Digite o nome do morador: ").nextLine();
        String cpf = capturarDados("Digite o cpf do morador : ").nextLine();
        String telefone = capturarDados("Digite o telefone do morador: ").nextLine();
        double renda = capturarDados("Digite o salario do morador: ").nextDouble();

        Morador morador = new Morador(nome, cpf, telefone, renda);
        return morador;
    }

    // Método responsável por cadastrar funcionários
    public static Funcionario cadastrarFuncionario() {
        String nome = capturarDados("Digite o nome do funcionário: ").nextLine();
        String cpf = capturarDados("Digite o cpf do funcionário: ").nextLine();
        String ctps = capturarDados("Digite a carteira de trabalho do funcionário: ").nextLine();

        Funcionario funcionario = new Funcionario(nome, cpf, ctps);
        return funcionario;
    }

    // Método responsável por cadastrar imóvel
    public static Imovel cadastrarImovel() {
        String enderecoImovel = capturarDados("Digite o endereço do imóvel: ").nextLine();
        double valorAluguel = capturarDados("Digite o valor do aluguel: ").nextDouble();

        Imovel imovel = new Imovel(enderecoImovel, valorAluguel);
        return imovel;
    }

    // Método responsável juntar tudo e criação do menu

    public static void executar() {

        Imobiliaria imobiliaria = new Imobiliaria();

        boolean menu = true;

        while (menu) {

            menu ();

            int opcaoDoUsuario = capturarDados("Digite a opção desejada: ").nextInt();

            if (opcaoDoUsuario == 1) {
                Imovel imovel = cadastrarImovel();
                Funcionario funcionario = cadastrarFuncionario();
                imovel.setFuncionario(funcionario);
                Morador morador = cadastrarMoradores();

                imovel.adicionarMorador(morador);
                imobiliaria.adicionarImovel(imovel);

            }

            else if (opcaoDoUsuario == 2) {
                System.out.println(imobiliaria);

            }
            else if (opcaoDoUsuario == 3) {
                System.out.println("Obrigado por usar o sistema.");
                menu = false;
            }

            else{
                System.out.println("Digite um valor válido para utilizar o menu.");
            }


        }
    }

}
