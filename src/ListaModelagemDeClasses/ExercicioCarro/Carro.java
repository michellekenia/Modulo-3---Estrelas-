package ListaModelagemDeClasses.ExercicioCarro;

/*
Criar uma classe carro com os atributos: nome, peso, fabricante, cor e valor.
Criar o método darDesconto, que servirá para diminuir o valor do carro.
Criar o método pintar, que será responsável por mudar a cor do carro.
Crie um carro no seu programa principal, utilize os métodos criados
e mostre na tela o preço e a cor do carro antes e depois da utilização dos métodos.
 */

public class Carro {

    String nome;
    String fabricante;
    String cor;
    double peso;
    double valor;

    public Carro(String nome, String fabricante, String cor, double peso, double valor) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.cor = cor;
        this.peso = peso;
        this.valor = valor;

    }

    public void darDesconto(double valorDesconto) {
        valor = valor - valorDesconto;
    }

    public void pintarCarro(String novaCor) {
        cor = novaCor;
    }

    public void mostrarCarro() {
        System.out.println("Nome: " + nome);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Cor: " + cor);
        System.out.println("Peso: " + peso + " Kg");
        System.out.println("Valor do carro: R$ " + valor);
    }

}

