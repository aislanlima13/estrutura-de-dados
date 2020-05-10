package metodos_ordenacao;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aislan Lima
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] v = new int[7];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < v.length; i++){
            System.out.println("Insira um valor para posição " + i + " do vetor");
            v[i] = scanner.nextInt();
        }
        
        bubbleSort(v);
    }
    
    public static void bubbleSort(int[] v){
        int aux;
        int n = v.length;
        
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n-1; j++){
                if(v[j] > v[j+1]){ //verifica se há necessidade para troca, caso haja acontece a troca
                    aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
        
        System.out.println("Exibir vetor ordenado: ");
        for(int i = 0; i < n; i++){
            System.out.println("Posição " + i + " valor: " + v[i]);
        }
    }
}