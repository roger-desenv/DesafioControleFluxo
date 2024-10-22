import java.util.Scanner; // Importa a classe Scanner para ler entradas do usuário

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada
        int numero; // Declara uma variável para armazenar o número inserido pelo usuário

        // Loop que pede um número até que o usuário insira um número positivo
        do {
            System.out.print("Digite um número inteiro positivo: "); // Pede ao usuário para digitar um número
            numero = scanner.nextInt(); // Lê o número digitado pelo usuário

            // Verifica se o número é menor ou igual a 0
            if (numero <= 0) {
                System.out.println("Por favor, digite um número positivo."); // Informa o usuário sobre o erro
            }
        } while (numero <= 0); // Continua pedindo enquanto o número for menor ou igual a 0

        // Início da contagem regressiva
        System.out.println("Contagem regressiva:"); // Mensagem para indicar que a contagem vai começar
        while (numero > 0) { // Enquanto o número for maior que 0
            System.out.println(numero); // Exibe o número atual
            numero--; // Decrementa o número em 1
        }

        scanner.close(); // Fecha o Scanner para liberar recursos
    }
}
