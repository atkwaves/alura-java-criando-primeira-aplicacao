package labs.a03;

import java.util.Random;
import java.util.Scanner;

public class DesafioJogoAdivinhacao {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tentativas = 0;
        boolean ganhou = false;
        int numeroGerado = new Random().nextInt(100); // Gera um número aleatório entre 0 e 100

        while (tentativas < 5) {

            System.out.println("Digite um número entre 0 e 100:");
            int numeroDigitado = scan.nextInt();

            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                ganhou = true;
                break;
            } else if (numeroDigitado > numeroGerado) {
                System.out.println("O número digitado é maior que o número gerado!");
            } else {
                System.out.println("O número digitado é menor que o número gerado!");
            }
        }

        if (tentativas == 5 && !ganhou) {
            System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era " + numeroGerado);
        }
    }
}
