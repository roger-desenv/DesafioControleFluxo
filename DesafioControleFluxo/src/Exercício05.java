import java.util.Scanner;

public class Exercício05 {
    public static void main(String[] args) {
        // Criando um array com os números de 1 a 5
        int[] numeros = {1, 3, 5};
        
        // Criando um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Pedindo ao usuário para adivinhar um número
        System.out.print("Adivinhe um número de 1 a 5: ");
        int numeroAdivinhado = scanner.nextInt();
        
        // Verificando se o número adivinhado está no array
        boolean acertou = false;
        for (int numero : numeros) { // Loop for-each
            if (numero == numeroAdivinhado) {
                acertou = true;
                break; // Se acertar, não precisa continuar o loop
            }
        }
        
        // Imprimindo o resultado
        System.out.println(acertou);
        
        // Fechando o Scanner
        scanner.close();
    }
}

