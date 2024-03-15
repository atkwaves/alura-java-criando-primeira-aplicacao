package labs.a03;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numeroDigitado = scan.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numeroDigitado; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numeroDigitado + " é: " + fatorial);
    }
}
