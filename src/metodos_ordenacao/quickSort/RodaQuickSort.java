/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_ordenacao.quickSort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aislan Lima
 */
public class RodaQuickSort {
    public static void main(String[] args) {
        Ordenacao ordena = new Ordenacao();
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
        System.out.println();
        
        ordena.quicksort(v,0,n-1);
        
        System.out.println("Vetor Ordenado MergeSort: ");
        for(i=0; i<n; i++) System.out.print(v[i] + " ");
            System.out.println();
    }
}
