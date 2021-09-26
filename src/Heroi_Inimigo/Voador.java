package Heroi_Inimigo;

public class Voador extends Inimigo {

    double danoTiro;

    public Voador(String nome, double vida, double danoTiro) {
        super(nome, vida);
        this.danoTiro = danoTiro;
    }

    public double aplicarDano() {
        return danoTiro;
    }
}
