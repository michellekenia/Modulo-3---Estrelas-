package Heroi_Inimigo;

public class Heroi {

    String nome;
    double vida;

    public Heroi(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void trocarNome(String nome) {
        this.nome = nome;

    }

    public void receberDano(double dano) {
        vida = vida - dano;

    }

    public double exibirVida() {
        System.out.println("Vida: " + vida);
        return vida;
    }
}
