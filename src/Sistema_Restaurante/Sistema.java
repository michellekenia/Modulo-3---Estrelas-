package Sistema_Restaurante;

import java.util.Scanner;

public class Sistema {

    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("Você está no sistema do restaurante VegFood");
        System.out.println("Digite 1 - Para cadastrar um prato.");
        System.out.println("Digite 2 - Para exibir os pratos cadastrados.");
        System.out.println("Digite 3 - Para sair do sistema.");
    }

    public static Ingrediente cadastrarIngrediente() {
        String nome = capturarDados("Digite os ingredientes.\n").nextLine();
        System.out.println();
        Ingrediente ingrediente = new Ingrediente(nome);
        return ingrediente;
    }

    public static Prato cadastrarPrato() {
        String nome = capturarDados("Digite o nome do prato.\n").nextLine();
        String tipo = capturarDados("Digite o tipo do prato (vegano/vegetariano).\n").nextLine();
        double valor = capturarDados("Digite o valor do prato.\n").nextDouble();

        Prato prato = new Prato(nome, tipo, valor);
        return prato;

    }

    public static void executar() {
        Restaurante restaurante = new Restaurante();

        boolean menu = true;

        while (menu) {

            menu();

            int opcaoDoUsuario = capturarDados("Digite a opção desejada:").nextInt();

            if (opcaoDoUsuario == 1) {

                Ingrediente ingrediente = cadastrarIngrediente();
                System.out.println();
                Prato prato = cadastrarPrato();

                prato.adicionarIngredientes(ingrediente);
                restaurante.adicionarPratos(prato);

            } else if (opcaoDoUsuario == 2) {
                System.out.println(restaurante);

            } else if (opcaoDoUsuario == 3) {
                System.out.println("Obrigado por usar o sistema.");
                menu = false;

            } else {
                System.out.println("Digite um valor válido para usar o menu.");
            }

        }


    }


}
