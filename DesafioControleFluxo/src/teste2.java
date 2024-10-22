public class teste2 {
  public static void main(String[] args) {
     // Array de Strings
     String[] nomes = {"Ana", "Bruno", "Carlos", "Daniela", "Eduardo"};

     for (String nome : nomes) {
      System.out.println("Nome: " + nome);
     }

     for (int i = 0; i < nomes.length; ++i) {
      System.out.println("Esse é diferente: " + nomes[i]);
     }
  }
}
