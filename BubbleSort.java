package terceiraUnidade;

/*
 * Implementando o BubbleSort que realiza um troca de valores entre posições consecutivas, 
 * fazendo com que valores altos ou baixos (dependendo da forma de ordenação desejada) 
 * sejam levados para o final da fila. 
 * Complexidade Pior Caso: O(n²) - quando todos os elementos estão desordenados.
 * Complexidade Caso Médio: O(n²)
 * Complexidade Melhor Caso: O(n) - quando todos os elementos já estão ordenados.
 * Geralmente utilizado para ordenar um pequeno número de valores
 * Giovanni Guimarães
 * */
public class BubbleSort {

	// começando do primeiro para o último
	public static void bubbleSort(int[] v) {
		// O laço for percorre o vetor do primeiro até o último elemento-1 tem
		// complexidade O(n) se o vetor já tiver ordenado decrescente
		for (int j = 1; j <= v.length - 1; j++) {
			// A primeira iteração no laço for irá capturar o primeiro valor
			// A segunda iteração compara com o próximo.
			// Então, se v[i] < v[i-1] ele entrará na condição de fazer a troca destes
			// valores.
			for (int i = v.length - 1; i >= j; i--) {
				if (v[i] < v[i - 1]) {
					trocar(v, i, i - 1);
				}
			}
		}
	}

	// começando do último para o primeiro tem complexidade O(n) se o vetor já tiver
	// ordenado crescente
	public static void bubbleSortInvertido(int[] v) {
		// O laço for percorre o vetor do último elemento até o primeiro elemento -1
		for (int ultimo = v.length - 1; ultimo > 0; ultimo--) {
			// A primeira iteração no laço for irá capturar o ultimo valor
			// A segunda iteração compara com o anterior.
			// Então v[i] > v[i+1], ele entrará na condição de fazer a troca destes valores.
			for (int i = 0; i < ultimo; i++) {
				if (v[i] > v[i + 1]) {
					trocar(v, i, i + 1);
				}
			}
		}
	}
	

	// O primeiro passo é criar as variáveis que nos auxiliarão na ordenação dos
	// valores.
	// Aqui criei uma função para efetuar a troca das posições
	private static void trocar(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}
}
