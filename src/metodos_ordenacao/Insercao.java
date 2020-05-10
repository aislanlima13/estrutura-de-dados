package metodos_ordenacao;

import java.util.Random;
import java.util.Scanner;

/**
 * Método Inserção consite em: ordenar os dois primeiros elementos do vetor e em seguida inserir os próximos elementos em sua posição ordenada
 * de acordo com os outros elementos já presentes no vetor.
 * @author Aislan Lima
 */
public class Insercao {
    public static void main(String[] args) {
        int[] v = new int[7];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < v.length; i++){
            System.out.println("Insira um valor para posição " + i + " do vetor");
            v[i] = scanner.nextInt();
        }
        
        insercao(v);
    }
    
    public static void insercao(int[] v){
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
        
        System.out.println("Exibir vetor ordenado: ");
        for(int i = 0; i < n; i++){
            System.out.println("Posição " + i + " valor: " + v[i]);
        }
    }
}