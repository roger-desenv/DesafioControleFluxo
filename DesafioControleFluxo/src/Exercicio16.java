import java.util.Scanner;

public class Exercicio16 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int []numeros = new int [2];
    
    System.out.println("Digite o primeiro número: ");
    numeros[0] = scanner.nextInt();

    System.out.println("Digite o segundo número: ");
    numeros[1] = scanner.nextInt();

    System.out.println("Os números inseridos foram:");
    System.out.println(numeros[0]);
    System.out.println(numeros[1]);
   
    

    
  }
}
