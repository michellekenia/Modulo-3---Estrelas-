package Lista_CriandoObjetos;

public class Main {
    public static void main(String[] args) {

        Bola bFutebol = new Bola("Futebol", "Adidas", "Branca", 70, 30);
        Carro fusquinha = new Carro("Volkswagem", "Fusca", "Roxo", 4600, 2, 10000);
        Pessoa michelle = new Pessoa("Michelle", 28, 70, 1.67);
        Conta_Corrente conta = new Conta_Corrente("Michelle Kênia", 2828, 929292, 100000);

        System.out.println(bFutebol.tipoDeEsporte);
        System.out.println(bFutebol.marca);
        System.out.println(bFutebol.cor);
        System.out.println(bFutebol.circunferencia + " cm");
        System.out.println(bFutebol.velocidade + " m/s");

        System.out.println();

        System.out.println(michelle.nome);
        System.out.println(michelle.idade);
        System.out.println(michelle.peso);
        System.out.println(michelle.altura);

        System.out.println();

        System.out.println(fusquinha.marca);
        System.out.println(fusquinha.modelo);
        System.out.println(fusquinha.cor);
        System.out.println(fusquinha.potencia + " rpm");
        System.out.println(fusquinha.qtdDePortas);
        System.out.println(fusquinha.valor + " R$");

        System.out.println();

        System.out.println(conta.nome);
        System.out.println(conta.agencia);
        System.out.println(conta.conta);
        System.out.println(conta.saldo + " R$");

    }
}
