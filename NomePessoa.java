package terceiraUnidade;

public class NomePessoa {
  public static void main(String[] args) {

    Pessoa Giovanni = new Pessoa(1, "Giovanni", "Ciência da Computação", "UFERSA");
    Pessoa Abilene = new Pessoa(2, "Abilene", "Pedagogia", "UFPE");
    Pessoa Giulia = new Pessoa(3, "Giulia", "Medicina Veterinária", "UFERSA");
    Pessoa Arthur = new Pessoa(4, "Arthur", "Ciências Contábeis", "UFERSA");
    Pessoa Anselmo = new Pessoa(5, "Anselmo", "Filosofia", "PUC-Recife");
    Pessoa Aldenisa = new Pessoa(6, "Aldenisa", "Pedagogia", "UERN");

    Pessoa[] pessoas = new Pessoa[] { Giovanni, Abilene, Giulia, Arthur, Anselmo, Aldenisa };

    ordenarPessoasPorNome(pessoas);

    for (int tamanho = 0; tamanho < pessoas.length; tamanho++) {
      System.out.println("Nome: " + pessoas[tamanho].getNome());
    }
  }

  /**
   * Método que ordena um vetor de Animal utilizando o algortimo Bubble Sort,
   * a ordenação é feita de acordo com a especie e nome de cada animal.
   * 
   * @param animais - Vetor de Animal.
   */
  public static void ordenarPessoasPorNome(Pessoa[] pessoas) {
    /*
     * for utilizado para controlar a quantidade de vezes que o vetor será
     * ordenado.
     */
    for (int i = 0; i < pessoas.length - 1; i++) {
      // Variavel utilizada para controlar se o vetor ja está ordenado.
      boolean estaOrdenado = true;
      // for utilizado para ordenar o vetor.
      for (int j = 0; j < pessoas.length - 1 - i; j++) {
        /*
         * Se o nome da pessoa na posição atual do vetor for maior
         * que o nome da pessoa da proxima pessoa, então troca os animais
         * de lugar no vetor.
         */
        if (pessoas[j].getNome().compareToIgnoreCase(pessoas[j + 1].getNome()) > 0) {
          Pessoa aux = pessoas[j];
          pessoas[j] = pessoas[j + 1];
          pessoas[j + 1] = aux;
          estaOrdenado = false;
        }
      }
      // Se o vetor está ordenado então para as iterações sobre ele.
      if (estaOrdenado)
        break;
    }
  }
}
