import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[2]; // Declaração do array com 2 posições

        // Loop para pedir 2 números ao usuário e armazená-los no array
        for (int i = 0; i < 2; i++) {
            System.out.print("Insira o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt(); // Armazena o número inserido no array
        }

        // Exibe os números armazenados
        System.out.println("Os números inseridos foram:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

       
    }
}

