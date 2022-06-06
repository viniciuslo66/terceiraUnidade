package terceiraUnidade;

/*
 * Implementando o QuickSort no qual é escolhido um elemento qualquer da lista, que será chamado de pivô.
 * Todos os elementos antes do pivô devem ser menores que ele e todos os elementos após o pivô devem ser maiores que ele. 
 * Quando esse processo de separação for finalizado, então o pivô deve estar exatamente no meio da lista.
 * De forma recursiva os elementos da sublista menor e maiores são ordenados.
 * Complexidade Pior Caso: O(n²)
 * Complexidade Caso Médio: (nlogn)
 * Complexidade Melhor Caso: (nlogn)
 * O tempo de processamento do QuickSort é muito bom quando tratamos do caso médio.
 * Giovanni Guimarães
 * */
public class QuickSort {

  public static void quickSort(int[] v, int inicio, int fim) {
    if (inicio < fim) {
      int posicaoPivo = particao(v, inicio, fim);
      quickSort(v, inicio, posicaoPivo - 1);
      quickSort(v, posicaoPivo + 1, fim);
    }
  }

  static int particao(int[] vetor, int inicio, int fim) {
    int meio = (int) (inicio + fim) / 2;
    int pivot = vetor[meio];
    inti = inicio - 1;
    intj = fim + 1;
    while (true) {
      do {
        i++;
      } while (vetor[i] < pivot);
      do {
        j--;
      } while (vetor[j] > pivot);
      if (i >= j) {
        return j;
      }
      int aux = vetor[i];
      vetor[i] = vetor[j];
      vetor[j] = aux;
    }
  }
}
