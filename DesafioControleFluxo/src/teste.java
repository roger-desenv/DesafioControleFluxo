public class teste {
  public static void main(String[] args) {
    // Array de strings representando números
    String[] pessoas = {"Joao", "Maria", "Helena", "José"};
    int[] numeros = {10, 25, 15, 20, 9};

    /*  Percorre o array de strings e converte cada string para int
    for (String pessoa : pessoas) {
        System.out.println("Essa pessoa é: " + pessoa);
    }*/

    for (int i=0; i < pessoas.length; i++) {
      System.out.println("Esse teste é com string: " + pessoas[i]);
    }

    for (int i = 0; i < numeros.length; ++i) {
        System.out.println("Número: " + numeros[i]);
    }
  
  }
}
