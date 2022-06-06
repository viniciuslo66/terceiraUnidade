package terceiraUnidade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class teste {

	public static void main(String[] args) {
		// Código de testes busca linear
		int[] num = { 2, 3, 8, -1, -4, 20, 0, 5 };
		String[] nomes = { "Giovanni", "Abilene" };

		int quantidade = 10000;
		int[] vetor = new int[quantidade];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * quantidade);
		}

		// criando alguns pessoas para teste
		Pessoa[] pessoa = new Pessoa[10];
		pessoa[0] = new Pessoa(1, "Giovanni", "Ciência da Computação", "UFERSA");
		pessoa[1] = new Pessoa(2, "Abilene", "Pedagogia", "UFPE");
		pessoa[2] = new Pessoa(3, "Giulia", "Medicina Veterinária", "UFERSA");
		pessoa[3] = new Pessoa(4, "Arthur", "Ciências Contábeis", "UFERSA");
		pessoa[4] = new Pessoa(5, "Anselmo", "Filosofia", "PUC-Recife");
		pessoa[5] = new Pessoa(6, "Aldenisa", "Pedagogia", "UERN");

		// criando uma lista de Pessoas (exemplo)
		List<Pessoa> listPessoa = new ArrayList<Pessoa>();
		listPessoa.add(pessoa[0]);
		listPessoa.add(pessoa[1]);
		listPessoa.add(pessoa[2]);
		listPessoa.add(pessoa[3]);
		listPessoa.add(pessoa[4]);
		listPessoa.add(pessoa[5]);
		System.out.println(listPessoa);

		System.out.println("Busca Linear");
		System.out.println("Key = 20, Índice = " + buscaLinear.buscaLinear(num, 20));
		System.out.println("Key = \"Pessoa[3]\", Índice = " + buscaLinear.buscaLinear(pessoa, pessoa[3]));

		System.out.println("Key = 9, Índice = " + buscaLinear.buscaLinear(num, 9));
		System.out.println("Key = \"Pessoa[5]\", Index = " + buscaLinear.buscaLinear(listPessoa, "Aldenisa"));

		System.out.println("Key = \"Giovanni\", Índice = " + buscaLinear.buscaLinear(nomes, "Giovanni"));
		System.out.println("Key = \"Giulia\", Índice = " + buscaLinear.buscaLinear(nomes, "Giulia"));

		// Código de testes busca binária
		// int[] vetor = {1, 3, 4, 55, 104, 222, 229, 300};

		System.out.println("Busca Linear");
		System.out.println("Key = 55, Índice = " + buscaBinaria.buscaBinariaRecursiva(vetor, 0, vetor.length - 1, 55));
		System.out.println("Key = 229, Índice = " + buscaBinaria.buscaBinariaIterativa(vetor, 229));

		System.out
				.println(buscaBinaria.buscaBinariaRecursiva(listPessoa, listPessoa.get(0).getItem(), listPessoa.size(), 4));
		System.out
				.println(buscaBinaria.buscaBinariaRecursiva2(listPessoa, listPessoa.get(0).getItem(), listPessoa.size(), 2));

		// Código de testes BubbleSort
		System.out.println(Arrays.toString(num));
		System.out.println("Ordenando com BubleSort");
		BubbleSort.bubbleSort(num);
		System.out.println(Arrays.toString(num));

		/*
		 * 
		 * 
		 * 
		 * //Código de testes InsertSort
		 * System.out.println(Arrays.toString(num));
		 * System.out.println("Ordenando com InsertSort");
		 * InsertSort.insertSort(num);
		 * System.out.println(Arrays.toString(num));
		 * 
		 * 
		 * //Código de testes SelectSort
		 * System.out.println(Arrays.toString(num));
		 * System.out.println("Ordenando com SelectSort");
		 * SelectSort.selectSort(num);
		 * System.out.println(Arrays.toString(num));
		 * 
		 */

		// Código de testes QuickSort
		System.out.println(Arrays.toString(num));
		System.out.println("Ordenando com QuickSort");
		QuickSort.quickSort(num, 0, num.length - 1);
		System.out.println(Arrays.toString(num));
		/*
		 * //Código de testes ShellSort
		 * System.out.println(Arrays.toString(num));
		 * System.out.println("Ordenando com ShellSort");
		 * ShellSort.shellSort(num,num.length);
		 * System.out.println(Arrays.toString(num));
		 */
		// Código de testes de desempenho
		System.out.println("Teste de desempenho");
		long tempoInicial = System.currentTimeMillis();
		ShellSort.shellSort(vetor, vetor.length);
		// QuickSort.quickSort(vetor,0,vetor.length-1);
		// SelectSort.selectSort(vetor);
		// InsertSort.insertSort(vetor);
		// BubbleSort.bubbleSort(vetor);
		long tempoFinal = System.currentTimeMillis();
		System.out.println("Executado com ShellSort em = " + (tempoFinal - tempoInicial) + " ms para 100.000 entradas");

	}
}
