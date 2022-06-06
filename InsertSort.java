package terceiraUnidade;

/*
 * Implementando o InsertSort que ordena os valores da esquerda para a direita, 
 * deixando os elementos lidos (a esquerda) ordenados. 
 * Complexidade Pior Caso: O(n²) - quando todos os elementos estão desordenados.
 * Complexidade Caso Médio: O(n²)
 * Complexidade Melhor Caso: O(n) - quando todos os elementos já estão ordenados.
 * Geralmente utilizado para ordenar um pequeno número de valores
 * Giovanni Guimarães
 * */

public class InsertSort {

	public static void insertSort(int[] vetor) {
		int aux, j;
		for (int i = 1; i < vetor.length; i++) {
			aux = vetor[i];
			j = i - 1;
			while (j >= 0 && vetor[j] > aux) {
				vetor[j + 1] = vetor[j];
				j--;
			}
			vetor[j + 1] = aux;
		}
	}
}
