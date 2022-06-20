package terceiraUnidade;

public class BubbleSort {

	public static void bubbleSort(int[] v) {
		for (int i = 1; i <= v.length - 1; i++) {
			for (int j = v.length - 1; j >= i; j--) {
				if (v[j] < v[j - 1]) {
					int aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
			}
		}
	}
}
