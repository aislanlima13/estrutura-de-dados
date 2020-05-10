package metodos_ordenacao.mergeSort;

/**
 *
 * @author Aislan Lima
 */
public class Ordenacao {
    public void mergeSort(int[] v, int inicio, int fim){
        if(inicio == fim) return;
        
        int meio = (inicio + fim)/2;
        
        mergeSort(v, inicio, meio);
        mergeSort(v, meio +1, fim);
        intercala(v,inicio,meio,fim);
    }
    
    public void intercala(int[] v, int inicio, int meio, int fim){
        int[] aux = new int[fim - inicio + 1];
        int i = inicio;
        int j = meio +1;
        int k = 0;
        
        //Inserindo itens do vetor v ordenadamento no vetor aux
        while(i <= meio && j <= fim){
            if(v[i] <= v[j])
                aux[k++] = v[i++];
            else
                aux[k++] = v[j++];
        }
        
        while(i <= meio)
            aux[k++] = v[i++];
        while(j <= fim)
            aux[k++] = v[j++];
        
        // copiando os valores do vetor ordenado (aux) para o vetor principal (v)
        for(i = 0; i < (fim-inicio+1); i++)
            v[inicio + i] = aux[i];
    }
}