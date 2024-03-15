package labs.a03;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numeroDigitado1 = scan.nextInt();

        System.out.println("Digite um segundo número inteiro:");
        int numeroDigitado2 = scan.nextInt();

        if (numeroDigitado1 == numeroDigitado2) {
            System.out.println("Os números são iguais!");
        } else if (numeroDigitado1 > numeroDigitado2) {
            System.out.println("Os números são diferentes, e o primeiro é maior que o segundo.");
        } else {
            System.out.println("Os números são diferentes, e o segundo é maior que o primeiro.");
        }
    }
}
