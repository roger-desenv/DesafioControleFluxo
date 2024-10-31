import java.util.Scanner;

public class Exercicio14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int [] numbers = new int[5];
    int soma = 0;
    int media = 0;

    for (int i = 0; i < 5; i++) {
      System.out.print("Insira o número " + (i + 1) + ": ");
      numbers[i] = scanner.nextInt();
      soma = soma + numbers[i];
      media = soma / numbers.length;
    }

    System.out.println("\nResumo dos números inseridos:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Número " + (i + 1) + ": " + numbers[i]);
    }

    System.out.println("\n\nA soma dos números é: " + soma);
    System.out.println("\n\nA média dos números é: " + media);

  }
}