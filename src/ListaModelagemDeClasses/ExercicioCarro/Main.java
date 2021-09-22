
package ListaModelagemDeClasses.ExercicioCarro;

public class Main {
    public static void main(String[] args) {

        Carro car = new Carro("Fusca", "Volksvagem", "Roxo", 100, 10000);

        System.out.println("Características do Carro");
        car.mostrarCarro();

        System.out.println();
        car.darDesconto(1000);
        System.out.println("Dando desconto: ");
        car.mostrarCarro();

        System.out.println();
        car.pintarCarro("Amarelo");
        System.out.println("Mudando a cor do carro: ");
        car.mostrarCarro();

        System.out.println();
        car.darDesconto(2000);
        System.out.println("Dando outro desconto: ");
        car.mostrarCarro();

        System.out.println();
        car.pintarCarro("Rosa");
        System.out.println("Mudando a cor novamente: ");
        car.mostrarCarro();


    }
}
