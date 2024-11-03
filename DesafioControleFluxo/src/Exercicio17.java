import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5]; // Declaração do array com 5 posições

        // Loop para pedir 5 números ao usuário e armazená-los no array
        for (int i = 0; i < 5; i++) {
            System.out.print("Insira o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt(); // Armazena o número inserido no array
        }

        // Inicializa 'menor' com o primeiro elemento do array após preenchê-lo
        int menor = numeros[0];

        // Loop para encontrar o menor valor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Exibe o menor valor encontrado
        System.out.println("O menor valor no array é: " + menor);
        
        scanner.close();
    }
}
