package metodos_ordenacao;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aislan Lima
 */
public class BubbleSort {
    public void bubbleSort(int[] v){
        long  tempoInicio = System.currentTimeMillis(); // inicia contagem do tempo
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
        System.out.println("\nTempo Gasto BubbleSort: " + (System.currentTimeMillis()-tempoInicio) + " milisegundos"); // fim contagem do tempo
//        System.out.println("\n\nExibir vetor ordenado: ");
//        for(int i = 0; i < n; i++){
//            System.out.println("Posição " + i + " valor: " + v[i]);
//        }  
    }
}