package metodos_ordenacao;

/**
 *
 * @author Aislan Lima
 */
public class OrdenacaoQuickSort {
    public void quicksort(int[] v, int esq, int dir) {
        long  tempoInicio = System.currentTimeMillis();
        int i = esq;
        int j = dir;
        int pivo = v [ (esq+dir)/2 ];
        int aux;
        
        do {
            while (v[i]<pivo && i<dir) //procura elementos menor que o pivô
                i++;
        
            while (pivo<v[j] && j>esq) //procura elementos menor que o pivo na segunda parte
                j--;
            
            if (i<=j) { //realiza troca e ordenação
                aux = v[i];
                v[i] = v[j];
                v[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        
        if (esq < j) 
            quicksort(v,esq,j);
        else if (i < dir) 
            quicksort(v,i,dir);
        else
            System.out.println("Tempo Gasto QuickSort: " + (System.currentTimeMillis()-tempoInicio) + " milisegundos");
    }
}
