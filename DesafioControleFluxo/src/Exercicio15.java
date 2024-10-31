public class Exercicio15 {
  public static void main(String[] args) {
    int [] numeros = new int [10];
    int maior = numeros[0];
    int menor = numeros[0];
    
    for (int i = 0; i < numeros.length; i++ ) {
      //System.out.println("Números inseridos: " + (i + 1));
      numeros[i] = i + 1;

      System.out.println("Números armazenados: " + numeros[i]);
      
      if(numeros[i] > maior) {
        maior = numeros[i];
      }

      if(numeros[i] < menor) {
        menor = numeros[i];
      }
    }

    System.out.println("O maior número é: " + maior);
    System.out.println("O menor número é: " + menor);

    
  }
}

