import java.util.Scanner;

public class Exercicio12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Escreva o primeiro número:");
    int number1 = scanner.nextInt();
    System.out.println("Você digitou: " + number1);

    System.out.println("Escreva o segundo número:");
    int number2 = scanner.nextInt();
    System.out.println("Você digitou: " + number2);

    if ( number1 > number2) {
      System.out.println("O maior número é " + number1);
    } else {
      System.out.println("O maior número é " + number2);
    }

  }
}
