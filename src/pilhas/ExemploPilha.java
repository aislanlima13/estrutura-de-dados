package pilhas;
/**
 *
 * @author Aislan Lima
 */
public class ExemploPilha {
    public static void main(String[] args){
        Pilha p = new Pilha(4);
        
        if(!p.full())   p.push(20.5);
        else    System.out.println("ATENÇÃO, PILHA CHEIA!");
        
        if (!p.full())  p.push(40.4);
        else    System.out.println("ATENCAO PILHA CHEIA");
        
        if (!p.full()) p.push(60.8); 
        else System.out.println("ATENCAO PILHA CHEIA");
        
        if (!p.full()) p.push(80.5);
        else System.out.println("ATENCAO PILHA CHEIA");
        
        if (!p.full()) p.push(10); 
        else System.out.println("ATENCAO PILHA CHEIA");
        
        while(!p.empty()){
            System.out.println(" " + p.top());
            p.pop();
        }
        
        System.out.println("\n");
    }
}