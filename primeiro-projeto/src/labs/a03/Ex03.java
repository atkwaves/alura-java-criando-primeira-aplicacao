package labs.a03;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("----- Menu -----");
        System.out.println("1. Calcular área do quadrado.");
        System.out.println("2. Calcular área do círculo.");
        System.out.println("3. Sair.");
        System.out.println("Escolha uma opção:");
        int opcao = scan.nextInt();

        if (opcao == 1) {
            System.out.println("Digite lado do quadrado em centímetros:");
            double ladoQuadrado = scan.nextDouble();
            double area = ladoQuadrado * ladoQuadrado;
            System.out.println(String.format("A área do quadrado é %.2f cm².", area));
        } else if (opcao == 2) {
            System.out.println("Digite o raio do círculo em centímetros:");
            double raio = scan.nextDouble();
            double area = Math.PI * Math.pow(raio, 2);
            System.out.println(String.format("A área do círculo é %.2f cm².", area));
        } else if (opcao == 3) {
            System.out.println("Programa encerrado!");
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }
    }
}
