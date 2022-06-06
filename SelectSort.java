package terceiraUnidade;

public class SelectSort {

	public static void selectSort(int[] v) {
		int posicao_menor;
		for (int i = 0; i < v.length - 1; i++) {
			posicao_menor = i;
			for (int j = i + 1; j < v.length; j++) {
				if (v[j] < v[posicao_menor]) {
					posicao_menor = j;
				}
			}

			int aux = vetor[posicao_menor];
			vetor[posicao_menor] = vetor[i];
			vetor[i] = aux;
		}
	}
}
