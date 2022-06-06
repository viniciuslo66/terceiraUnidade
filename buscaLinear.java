package terceiraUnidade;

import java.util.List;

public class buscaLinear {

    // procura o valor 'key' no vetor 'a'
    public static int buscaLinear(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i; // valor encontrado, retorna o índice
            }
        }
        return -1; // valor não encontrado
    }

    // procura o objeto 'key' no vetor 'a'
    public static int buscaLinear(Object[] a, Object key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(key)) {
                return i; // valor encontrado, retorna o índice
            }
        }
        return -1; // valor não encontrado
    }

    public static int buscaLinear(List<Pessoa> listPessoa, String nome) {
        for (int i = 0; i < listPessoa.size(); i++) {
            if (listPessoa.get(i).getNome().equalsIgnoreCase(nome)) {
                return i; // valor encontrado, retorna o índice
            }
        }
        return -1; // valor não encontrado
    }

}