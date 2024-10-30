import java.util.Scanner;

public class Exercicio14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int [] numbers = new int[5];

    for (int i = 0; i < 5; i++) {
      System.out.print("Insira o número " + (i + 1) + ": ");
      numbers[i] = scanner.nextInt();
    }

    System.out.println("\nResumo dos números inseridos:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Número " + (i + 1) + ": " + numbers[i]);
    }
  }
}