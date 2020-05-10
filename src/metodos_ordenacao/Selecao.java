package metodos_ordenacao;

import java.util.Random;
import java.util.Scanner;

/**
 * Método de busca Seleção consiste em: trocar o menor elemento de um vetor com o elemento posicionado na primeira posição
 * e assim por diante (menor para segunda posição, para terceira...).
 * @author Aislan Lima
 */
public class Selecao {
    public void selecao(int[] v){
        long  tempoInicio = System.currentTimeMillis(); 
        int aux, min;
        int n = v.length;
        
        for (int i=0; i < n-1; i++) {
            min = i;
            for (int j=i+1; j < n; j++) { // for para buscar nas posições superiores a i um elemento que possa ser menor que o minimo
                if (v[j] < v[min]) // caso encontre elemento menor que o minimo, minimo passa e ter esse valor
                    min=j;
            }
            
            aux = v[i];
            v[i] = v[min];
            v[min] = aux;
        }
        System.out.println("\nTempo gasto Seleção: " + (System.currentTimeMillis()-tempoInicio) + " milisegundos");
        
//        System.out.println("Exibir vetor ordenado: ");
//        for(int i = 0; i < n; i++){
//            System.out.println("Posição " + i + " valor: " + v[i]);
//        }
    }
}