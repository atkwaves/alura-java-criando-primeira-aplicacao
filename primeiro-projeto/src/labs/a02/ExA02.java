package labs.a02;

public class ExA02 {

    public static void main(String[] args) {

        double nota01 = 10.0;
        double nota02 = 8.0;
        double media = (nota01 + nota02) / 2;

        System.out.println("Média: " + media);

        double variavelDouble = 7.5;
        int variavelInt = (int) variavelDouble;

        System.out.println("Casting de double para int: " + variavelInt);

        char variavelChar = 'A';
        String variavelString = "zul";

        System.out.println("A palavra é: " + (variavelChar + variavelString));

        double precoProduto = 15.00;
        int quantidade = 2;
        double valorTotal = precoProduto * quantidade;

        System.out.println("O valor total da compra é R$" + valorTotal);

        double valorEmDolares = 20;
        double cotacaoDolar = 4.94;
        double valorConvertidoReais = cotacaoDolar * valorEmDolares;

        System.out.println(String.format("R$ %.2f", valorConvertidoReais));

        double precoOriginal = 50.0;
        double percentualDesconto = 10;
        double valorDesconto = (precoOriginal * percentualDesconto) / 100;
        double precoComDesconto = precoOriginal - valorDesconto;


        System.out.println("O preço com desconto é R$" + precoComDesconto);
    }
}
