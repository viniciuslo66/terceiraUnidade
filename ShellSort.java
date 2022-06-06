package terceiraUnidade;

/*
 * Implementando o ShellSort que é muito semelhante ao InsertSort porém 
 * permite a troca de registros distantes um do outro, tornando-o mais eficiente.
 * Complexidade Pior Caso: O(n²) - quando todos os elementos estão desordenados.
 * Complexidade Caso Médio: O(n(log(n))
 * Complexidade Melhor Caso: O(n) - quando todos os elementos já estão ordenados.
 * Geralmente utilizado para ordenar um grande número de valores
 * Giovanni Guimarães
 */
public class ShellSort {

	public static void shellSort(int[] v, int num) {
		int h = 1;
		int n = v.length;

		// dividindo o vetor em várias partes e muitas vezes
		while (h < n) {
			h = h * 3 + 1; // tamanho do salto
		}

		h = h / 3;
		int c, j;

		while (h > 0) {
			for (int i = h; i < n; i++) {// ordenando o vetor
				c = v[i];
				j = i;
				while (j >= h && v[j - h] > c) {
					v[j] = v[j - h];
					j = j - h;
				}
				v[j] = c;
			}
			h = h / 2;
		}
	}
}
