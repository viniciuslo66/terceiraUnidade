package terceiraUnidade;

public class ShellSort {

	public static void shellSort(int[] vetor) {
		int h = 1;
		int n = vetor.length;

		while (h < n) {
			h = h * 3 + 1;
		}

		h = h / 3;
		int c, j;

		while (h > 0) {
			for (int i = h; i < n; i++) {
				c = vetor[i];
				j = i;
				while (j >= h && vetor[j - h] > c) {
					vetor[j] = vetor[j - h];
					j = j - h;
				}
				vetor[j] = c;
			}
			h = h / 2;
		}
	}
}
