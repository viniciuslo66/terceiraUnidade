package terceiraUnidade;

/*
 * Implementando o SelectSort que passa sempre o menor valor para a primeira posição, 
 * para isso percorre todos os elementos procurando um menor valor. 
 * Complexidade Pior Caso: O(n²) - quando todos os elementos estão desordenados.
 * Complexidade Caso Médio: O(n²)
 * Complexidade Melhor Caso: O(n²) - quando todos os elementos já estão ordenados.
 * Geralmente utilizado para ordenar um pequeno número de valores
 * Giovanni Guimarães
 * */
public class SelectSort {

	public static void selectSort(int[] v) {
		// O laço for, que percorre todos os elementos, guardando o valor da iteração
		// atual
		// na variável “fixo”.
		for (int fixo = 0; fixo < v.length - 1; fixo++) {
			// Uma variável auxiliar chamada menor que guardará o valor de fixo.
			int menor = fixo;
			// Guardada a variável menor, que na primeira iteração é igual ao primeiro
			// elemento do vetor,
			// percorremos (através de outro laço for) todos os elementos do array partindo
			// do segundo
			// elemento até o último comparando se o elemento atual é menor que o elemento
			// que está na variável menor.
			for (int i = menor + 1; i < v.length; i++) {
				if (v[i] < v[menor]) {// Se isso for verdade então a variável menor é substituída pelo valor de do
															// array na posição i
					menor = i;
				}
			}
			// No final do segundo laço for teremos na variável menor a posição do menor
			// elemento lido,
			// se esta posição for diferente da posição atual que está na variável fixo
			// então faremos uma troca.
			if (menor != fixo) {
				trocar(v, fixo, menor);
			}
		}
	}

	private static void trocar(int[] v, int fixo, int menor) {
		int t = v[fixo];
		v[fixo] = v[menor];
		v[menor] = t;
	}
}
