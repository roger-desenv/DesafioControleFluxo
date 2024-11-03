import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) { // Inicia o loop em i = 0
            System.out.print("Insira o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números inseridos: ");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        
        scanner.close(); // Fecha o scanner
    }
}
