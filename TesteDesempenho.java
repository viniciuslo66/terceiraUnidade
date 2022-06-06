package terceiraUnidade;

/*
 * Construa funções para todos os algoritmos de ordenação da unidade 3 
 * e coloque todos em um único programa. Execute todas as funções com a mesma entrada, 
 * e compare o tempo de execução em milissegundos de cada função implementada.
 * Giovanni Guimarães
 * */
import java.util.Arrays;

public class TesteDesempenho {

	public static void main(String[] args) {

		final int TAM_VETOR = 10000;
		// Importante: Não printar os resultados para valores muito grandes

		testeDesempenhoBubbleSort(TAM_VETOR);
		testeDesempenhoSelectSort(TAM_VETOR);
		testeDesempenhoInsertSort(TAM_VETOR);
		testeDesempenhoShellSort(TAM_VETOR);
		testeDesempenhoQuickSort(TAM_VETOR);
	}

	public static int[] geraVetor(String v, int TAM_VETOR) {
		int[] vetor = new int[TAM_VETOR];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * TAM_VETOR);
		}
		return vetor;
	}

	public static void testeDesempenhoBubbleSort(int TAM_VETOR) {
		// Código de testes de desempenho
		int vetor[] = geraVetor("vetor", TAM_VETOR);
		System.out.println("\nTeste de desempenho");
		// System.out.println("Vetor:" + Arrays.toString(vetor)); //apenas para valores
		// pequenos
		long tempoInicial = System.currentTimeMillis();
		bubbleSort(vetor);
		long tempoFinal = System.currentTimeMillis();
		// System.out.println("Vetor ordenado:" + Arrays.toString(vetor)); //apenas para
		// valores pequenos
		System.out.println("Executado com BubbleSort em = " + (tempoFinal - tempoInicial) + " ms para " + TAM_VETOR
				+ " entradas aleatórias");
	}

	public static void testeDesempenhoInsertSort(int TAM_VETOR) {
		// Código de testes de desempenho
		int vetor[] = geraVetor("vetor", TAM_VETOR);
		System.out.println("\nTeste de desempenho");
		// System.out.println("Vetor:" + Arrays.toString(vetor)); //apenas para valores
		// pequenos
		long tempoInicial = System.currentTimeMillis();
		insertSort(vetor);
		long tempoFinal = System.currentTimeMillis();
		// System.out.println("Vetor ordenado:" + Arrays.toString(vetor)); //apenas para
		// valores pequenos
		System.out.println("Executado com InsertSort em = " + (tempoFinal - tempoInicial) + " ms para " + TAM_VETOR
				+ " entradas aleatórias");
	}

	public static void testeDesempenhoSelectSort(int TAM_VETOR) {
		// Código de testes de desempenho
		int vetor[] = geraVetor("vetor", TAM_VETOR);
		System.out.println("\nTeste de desempenho");
		// System.out.println("Vetor:" + Arrays.toString(vetor)); //apenas para valores
		// pequenos
		long tempoInicial = System.currentTimeMillis();
		bubbleSort(vetor);
		long tempoFinal = System.currentTimeMillis();
		// System.out.println("Vetor ordenado:" + Arrays.toString(vetor)); //apenas para
		// valores pequenos
		System.out.println("Executado com SelectSort em = " + (tempoFinal - tempoInicial) + " ms para " + TAM_VETOR
				+ " entradas aleatórias");
	}

	public static void testeDesempenhoShellSort(int TAM_VETOR) {
		// Código de testes de desempenho
		int vetor[] = geraVetor("vetor", TAM_VETOR);
		System.out.println("\nTeste de desempenho");
		// System.out.println("Vetor:" + Arrays.toString(vetor)); //apenas para valores
		// pequenos
		long tempoInicial = System.currentTimeMillis();
		shellSort(vetor, TAM_VETOR - 1);
		long tempoFinal = System.currentTimeMillis();
		// System.out.println("Vetor ordenado:" + Arrays.toString(vetor)); //apenas para
		// valores pequenos
		System.out.println("Executado com ShellSort em = " + (tempoFinal - tempoInicial) + " ms para " + TAM_VETOR
				+ " entradas aleatórias");
	}

	public static void testeDesempenhoQuickSort(int TAM_VETOR) {
		// Código de testes de desempenho
		int vetor[] = geraVetor("vetor", TAM_VETOR);
		System.out.println("\nTeste de desempenho");
		// System.out.println("Vetor:" + Arrays.toString(vetor)); //apenas para valores
		// pequenos
		long tempoInicial = System.currentTimeMillis();
		quickSort(vetor, 0, TAM_VETOR - 1);
		long tempoFinal = System.currentTimeMillis();
		// System.out.println("Vetor ordenado:" + Arrays.toString(vetor)); //apenas para
		// valores pequenos
		System.out.println("Executado com QuickSort em = " + (tempoFinal - tempoInicial) + " ms para " + TAM_VETOR
				+ " entradas aleatórias");
	}

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

	public static void shellSort(int[] v, int num) {
		int h = 1;
		int n = v.length;

		while (h < n) {
			h = h * 3 + 1;
		}

		h = h / 3;
		int c, j;

		while (h > 0) {
			for (int i = h; i < n; i++) {
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
					trocarBubble(v, i, i - 1);
				}
			}
		}
	}

	public static void quickSort(int[] v, int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = separar(v, inicio, fim);
			quickSort(v, inicio, posicaoPivo - 1);
			quickSort(v, posicaoPivo + 1, fim);
		}
	}

	// O primeiro passo é separar as listas
	// No método abaixo esse processo é realizado até que seja retornado um pivô,
	// ou seja, o elemento que divide as duas listas.
	private static int separar(int[] v, int inicio, int fim) {
		int pivo = v[inicio];
		int i = inicio + 1, f = fim;
		while (i <= f) {
			if (v[i] <= pivo) // Condição de parada da recursividade
				i++;
			else if (pivo < v[f]) // Condição de parada da recursividade
				f--;
			else {
				int troca = v[i];
				v[i] = v[f];
				v[f] = troca;
				i++;
				f--;
			}
		}
		v[inicio] = v[f];
		v[f] = pivo;
		return f;
	}

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
				trocarSelect(v, fixo, menor);
			}
		}
	}

	// Aqui criei uma função para efetuar a troca das posições
	private static void trocarBubble(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}

	// Aqui criei outra função para efetuar a troca das posições
	private static void trocarSelect(int[] v, int fixo, int menor) {
		int t = v[fixo];
		v[fixo] = v[menor];
		v[menor] = t;
	}
}
