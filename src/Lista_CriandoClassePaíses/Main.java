package Lista_CriandoClassePaíses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Paises> paisesAmericaDoSul = new ArrayList<>();

        Paises bolivia = new Paises("Bolívia", 1099000, 11.5);
        Paises brasil = new Paises("Brasil", 8516000, 211);
        Paises chile = new Paises("Chile", 756950, 18.9);
        Paises colombia = new Paises("Colômbia", 1143000, 50.3);

        paisesAmericaDoSul.add(bolivia);
        paisesAmericaDoSul.add(brasil);
        paisesAmericaDoSul.add(chile);
        paisesAmericaDoSul.add(colombia);

        int resposta = 0;

        while (true) {

            System.out.println("Digite 1 para mostrar a lista de países.");
            System.out.println("Digite 2 para sair do programa.");

            resposta = leitor.nextInt();
            leitor.nextLine();

            if (resposta == 1) {

                for (Paises referencia : paisesAmericaDoSul) {
                    System.out.print("O país é: ");
                    System.out.println(referencia.nome);
                    System.out.print("O território é: ");
                    System.out.println(referencia.territorio + " km²");
                    System.out.print("A população é: ");
                    System.out.println(referencia.populacao + " milhões");

                }


            } else if (resposta == 2) {
                return;
            } else {
                System.out.println("Digite um número válido.");
            }

        }


    }
}
