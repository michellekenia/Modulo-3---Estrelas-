package Heroi_Inimigo;

public class Mago extends Heroi {
    double poderMagico;


    public Mago(String nome, double vida, double poderMagico) {
        super(nome, vida);
        this.poderMagico = poderMagico;
    }

    public double aplicarMagia() {
        return poderMagico;
    }
}
