package metodos_ordenacao;

import java.util.Random;
import java.util.Scanner;

/**
 * Método Inserção consite em: ordenar os dois primeiros elementos do vetor e em seguida inserir os próximos elementos em sua posição ordenada
 * de acordo com os outros elementos já presentes no vetor.
 * @author Aislan Lima
 */
public class Insercao {  
    public void insercao(int[] v){
        long  tempoInicio = System.currentTimeMillis(); 
        int marcada;
        int n = v.length;
        
        for (int i= 1; i < n; i++) {
            marcada = v[i];
            int j = i;
            while ((j > 0) && (v[j-1] > marcada)) {
                v[j] = v[j-1];
                j = j - 1;
            }
            v[j] = marcada;
        }
        
        System.out.println("Tempo gasto Inserção: " + (System.currentTimeMillis()-tempoInicio) + " milisegundos");
        
//        System.out.println("Exibir vetor ordenado: ");
//        for(int i = 0; i < n; i++){
//            System.out.println("Posição " + i + " valor: " + v[i]);
//        }
    }
}