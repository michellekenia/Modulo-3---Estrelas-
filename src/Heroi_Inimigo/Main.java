package Heroi_Inimigo;

public class Main {
    public static void main(String[] args) {

        Heroi heroi = new Heroi("Qualquer Herói", 10000);
        Inimigo inimigo = new Inimigo("Qualquer Inimigo", 500);

        Mago mago = new Mago("Dumbledore", 5000, 1000);
        Guerreiro guerreiro = new Guerreiro("Meninas Super Poderosas", 3000, 1000);

        Rasteiro rasteiro = new Rasteiro("Serpente", 1000, 100);
        Voador voador = new Voador("Águia Escarlate", 2000, 200);

        System.out.println("Nome: " + guerreiro.nome);
        guerreiro.exibirVida();
        System.out.println();
        System.out.println("Nome: " + mago.nome);
        mago.exibirVida();
        System.out.println();
        System.out.println("Nome: " + voador.nome);
        voador.exibirVida();
        System.out.println();
        System.out.println("Nome: " + rasteiro.nome);
        rasteiro.exibirVida();
        System.out.println();

        guerreiro.trocarNome("Docinho");
        System.out.println("Nome: " + guerreiro.nome);
        guerreiro.exibirVida();
        System.out.println();

        voador.receberDano(guerreiro.aplicarDano());
        System.out.println("Vida do voador após receber dano:");
        System.out.println(voador.vida);


    }
}
