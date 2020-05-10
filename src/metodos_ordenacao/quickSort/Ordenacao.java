package metodos_ordenacao.quickSort;

/**
 *
 * @author Aislan Lima
 */
public class Ordenacao {
    public void quicksort(int[] v, int esq, int dir) {
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
        
        if (esq < j) quicksort(v,esq,j);
        if (i < dir) quicksort(v,i,dir);
    }
}
