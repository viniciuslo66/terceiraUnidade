package terceiraUnidade;

import java.util.List;

public class buscaBinaria {

	// Tenta encontrar o elemento no array especificado (iterativamente).
	// Complexidade no tempo: O(log n).
	public static int buscaBinariaIterativa(int[] a, int key) {
		int inicio = 0;
		int fim = a.length - 1;
		while (inicio <= fim) {
			// calcula o meio
			int media = (inicio + fim) / 2;
			if (key == a[media]) {
				// o elemento foi encontrado
				return media;
			} else if (key > a[media]) {
				// a busca continuará no subarray à direira
				inicio = media + 1;
			} else {
				// a busca continuará no subarray à esquerda
				fim = media - 1;
			}
		}
		// o elemento não está no array
		return -1;
	}

	// Tenta encontrar o elemento no array especificado (recursivamente).
	// Complexidade no tempo: O(log n).
	public static int buscaBinariaRecursiva(int[] a, int inicio, int fim, int key) {
		if (inicio <= fim) {
			// calcula o meio
			int media = (inicio + fim) / 2;
			if (key == a[media]) {
				// o elemento foi encontrado
				return media;
			} else if (key > a[media]) {
				// a busca continuará no subarray à direira
				return buscaBinariaRecursiva(a, media + 1, fim, key);
			} else {
				// a busca continuará no subarray à esquerda
				return buscaBinariaRecursiva(a, inicio, media - 1, key);
			}
		} else {
			// o elemento não está no array
			return -1;
		}
	}

	// Tenta encontrar o elemento no List especificado (recursivamente) retornando o
	// item.
	// Complexidade no tempo: O(log n).
	public static int buscaBinariaRecursiva(List<Pessoa> listPessoa, int inicio, int fim, int key) {
		if (inicio <= fim) {
			// calcula o meio
			int media = (inicio + fim) / 2;
			if (key == listPessoa.get(media).getItem()) {
				// o elemento foi encontrado
				return media;
			} else if (key > listPessoa.get(media).getItem()) {
				// a busca continuará no subarray à direira
				return buscaBinariaRecursiva(listPessoa, media + 1, fim, key);
			} else {
				// a busca continuará no subarray à esquerda
				return buscaBinariaRecursiva(listPessoa, inicio, media - 1, key);
			}
		} else {
			// o elemento não está no array
			return -1;
		}
	}

	// Essa variante tenta encontrar o elemento no List especificado
	// (recursivamente) e retorna o toString.
	// Complexidade no tempo: O(log n).
	public static String buscaBinariaRecursiva2(List<Pessoa> listPessoa, int inicio, int fim, int key) {
		if (inicio <= fim && (key <= fim && key >= inicio)) {
			// calcula o meio
			int media = (inicio + fim) / 2;
			if (key == listPessoa.get(media).getItem()) {
				// o elemento foi encontrado
				return listPessoa.get(media).toString();
			} else if (key > listPessoa.get(media).getItem()) {
				// a busca continuará no subarray à direira
				return buscaBinariaRecursiva2(listPessoa, media + 1, fim, key);
			} else {
				// a busca continuará no subarray à esquerda
				return buscaBinariaRecursiva2(listPessoa, inicio, media - 1, key);
			}
		} else {
			// o elemento não está no array
			return "Não encontrei";
		}
	}

}
