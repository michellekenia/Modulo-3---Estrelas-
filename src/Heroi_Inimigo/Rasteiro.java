package Heroi_Inimigo;

public class Rasteiro extends Inimigo {

    double danoEspinho;

    public Rasteiro(String nome, double vida, double danoEspinho) {
        super(nome, vida);
        this.danoEspinho = danoEspinho;
    }

    public double aplicarDano() {
        return danoEspinho;

    }
}
