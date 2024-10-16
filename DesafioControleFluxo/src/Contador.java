import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Recebe os dois números inteiros
            System.out.print("Digite o primeiro número: ");
            int parametroUm = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int parametroDois = scanner.nextInt();

            // Verifica se o primeiro parâmetro é maior ou igual ao segundo e lança exceção se necessário
            if (parametroUm >= parametroDois) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            // Determina a quantidade de iterações como o menor dos dois números
            int iteracoes = Math.min(parametroUm, parametroDois);

            // Realiza as iterações e imprime os números incrementados
            for (int i = 0; i < iteracoes; i++) {
                System.out.println((parametroUm + i) + "\t" + (parametroDois + i));
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

// Definindo a exceção customizada
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}