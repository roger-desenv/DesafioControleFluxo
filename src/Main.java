import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int parametroUm = 0, parametroDois = 0;
        boolean validInput = false;

        // Loop até que os parâmetros válidos sejam fornecidos
        while (!validInput) {
            try {
                // Recebe o primeiro número inteiro
                System.out.print("Digite o primeiro número: ");
                parametroUm = scanner.nextInt();

                // Recebe o segundo número inteiro
                System.out.print("Digite o segundo número: ");
                parametroDois = scanner.nextInt();

                // Verifica se o primeiro parâmetro é maior que o segundo e lança exceção se necessário
                if (parametroUm >= parametroDois) {
                    throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
                    
                }

                validInput = true; // Parâmetros válidos, sai do loop

            } catch (ParametrosInvalidosException e) {
                // Captura a exceção e exibe a mensagem
                System.out.println(e.getMessage());
                System.out.println("Tente novamente.");
            }
        }

        // Determina a quantidade de iterações como o menor dos dois números
        int iteracoes = Math.min(parametroUm, parametroDois);

        // Realiza as iterações e imprime os números incrementados
        for (int i = 0; i < iteracoes; i++) {
            System.out.println((parametroUm + i) + "\t" + (parametroDois + i));
        }

        // Fecha o scanner
        scanner.close();
    }
}

// Definindo a exceção customizada
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

