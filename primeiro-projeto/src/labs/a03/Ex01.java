package labs.a03;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numeroDigitado = scan.nextInt();

        if (numeroDigitado > 0) {
            System.out.println("Número positivo!");
        } else if (numeroDigitado < 0) {
            System.out.println("Número negativo!");
        } else {
            System.out.println("Número neutro!");
        }
    }
}
