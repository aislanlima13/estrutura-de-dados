package metodos_ordenacao;

import java.util.Random;
import java.util.Scanner;

/**
 * Exercício para comparar o tempo de execução 
 * @author Aislan Lima
 */
public class ComparaTempo {
    public static void main(String[] args) {
        BubbleSort bubble = new BubbleSort();
        Selecao selecao = new Selecao();
        Insercao insercao = new Insercao();
        MergeSort ordenaMerge = new MergeSort();
        OrdenacaoQuickSort ordenaQuickSort = new OrdenacaoQuickSort();
        
        Scanner le = new Scanner(System.in);
        Random aleatorios = new Random();

        System.out.print("Entre com a quantidade de elementos que deseja ordenar: ");
        int n = le.nextInt();
        int[] v = new int[n];
        int i;
        
        System.out.println("Vetor: ");
        for(i=0; i<n; i++) {
            v[i] = aleatorios.nextInt(101);
            System.out.print(v[i] + " ");
        }
        
        bubble.bubbleSort(v);
        selecao.selecao(v);
        insercao.insercao(v);
        ordenaMerge.mergeSort(v,0,n-1);
        ordenaQuickSort.quicksort(v,0,n-1);
    }
}
