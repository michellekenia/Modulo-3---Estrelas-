package Heroi_Inimigo;

public class Guerreiro extends Heroi {

    double poderAtaque;

    public Guerreiro(String nome, double vida, double poderAtaque) {
        super(nome, vida);
        this.poderAtaque = poderAtaque;
    }

    public double aplicarDano() {
        return poderAtaque;
    }
}
