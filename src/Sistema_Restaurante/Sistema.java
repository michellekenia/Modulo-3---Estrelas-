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

    public static Ingrediente cadastrarIngrediente () {
        String nome = capturarDados("Digite o ingrediente.").nextLine();

        Ingrediente ingrediente = new Ingrediente(nome);
        return ingrediente;
    }




}
