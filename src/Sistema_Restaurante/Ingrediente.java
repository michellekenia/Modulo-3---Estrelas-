package Sistema_Restaurante;

public class Ingrediente {

    private String nome;

    public Ingrediente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder ();
        retorno.append("\nNome dos ingredientes: " + nome);
        return retorno.toString();
    }
}
