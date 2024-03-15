package labs.a03;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numeroDigitado = scan.nextInt();

        System.out.println("Tabuada do " + numeroDigitado + ":");

        for (int i = 0; i <= 10; i++) {
            System.out.println(numeroDigitado + " x " + i + " = " + (i * numeroDigitado));
        }
    }
}
