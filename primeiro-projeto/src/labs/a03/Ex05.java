package labs.a03;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numeroDigitado = scan.nextInt();

        if (numeroDigitado % 2 == 0) {
            System.out.println("Número é par!");
        } else {
            System.out.println("Número é ímpar!");
        }
    }
}
