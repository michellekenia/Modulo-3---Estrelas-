package ExemploAnimal;

public class Main {
    public static void main(String[] args) {

        Baleia baleiaAzul = new Baleia("Baleia Azul","Mamífero aquático","Oceanos", 30,150000);
        Cachorro labrador = new Cachorro("Labrador", "Mamífero canino", "Domesticado", 60, 30);
        Gato maineCoon = new Gato("Maine Coon", "Mamífero felino", "Domesticado", 40, 11);
        Papagaio papagaioVerdadeiro = new Papagaio("Papagaio Verdadeiro", "Ave", "Florestas úmidas",37, 400);

        System.out.println("Lista de animais e suas características:");

        System.out.println(baleiaAzul.nome);
        System.out.println(baleiaAzul.tipo);
        System.out.println(baleiaAzul.habitat);
        System.out.println(baleiaAzul.comprimento  + " m");
        System.out.println(baleiaAzul.peso + " Kg");

        System.out.println("*********************");

        System.out.println(labrador.raça);
        System.out.println(labrador.tipo);
        System.out.println(labrador.habitat);
        System.out.println(labrador.comprimento  + " cm");
        System.out.println(labrador.peso + " Kg");

        System.out.println("*********************");

        System.out.println(maineCoon.raça);
        System.out.println(maineCoon.tipo);
        System.out.println(maineCoon.habitat);
        System.out.println(maineCoon.comprimento  + " cm");
        System.out.println(maineCoon.peso + " Kg");

        System.out.println("*********************");

        System.out.println(papagaioVerdadeiro.nome);
        System.out.println(papagaioVerdadeiro.tipo);
        System.out.println(papagaioVerdadeiro.habitat);
        System.out.println(papagaioVerdadeiro.comprimento  + " cm");
        System.out.println(papagaioVerdadeiro.peso + " g");

    }
}
