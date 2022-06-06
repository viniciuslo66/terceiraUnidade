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

	public static void insertSort(int[] v) {
		int j;
		int key;
		int i;
		// A estrutura de repetição irá percorrer todo o vetor começando do segundo
		// elemento

		for (j = 1; j < v.length; j++) {
			key = v[j]; // atribuindo o valor a uma variável que chamamos key.
			// O segundo laço itera sobre os valores que estão antes da variável key.
			// A iteração continuará até que o valor de i seja maior ou igual a zero
			// e o valor do vetor na posição i seja maior que o valor de key.
			for (i = j - 1; (i >= 0) && (v[i] > key); i--) { // Ao acessar o segundo laço for é feita uma atribuição.
				v[i + 1] = v[i]; // Temos então que vetor[0+1] = vetor[0]
			}
			v[i + 1] = key; // Prossegue até que todos os valores do vetor
		} // sejam percorridos e estejam ordenados
	}
}
