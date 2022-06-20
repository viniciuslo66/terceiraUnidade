package terceiraUnidade;
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
    int i = inicio - 1;
    int j = fim + 1;
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
