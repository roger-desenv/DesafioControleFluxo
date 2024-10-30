import java.util.Scanner;

public class Exercicio09 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite um número inteiro: ");
    int number1 = scanner.nextInt();
    System.out.println("Você digitou: " + number1);

    if (number1 % 2 == 0){
      System.out.println("Seu número é par!");
    } else {
      System.out.println("Seu número é impar!");
    }

  }
}
