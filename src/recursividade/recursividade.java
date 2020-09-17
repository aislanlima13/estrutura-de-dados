package recursividade;

public class teste{
    public static void main(String[] args) {
        int[] vet = {2, -4, 7, 0, -1, 4};
        f(vet, 6);
    }

    private static int f(int[] v, int n) {
        if (n == 0) return 0;
        else {
           int s;
           s = f( v, n-1);

           if (v[n-1] > 0) s = s + v[n-1];   
           System.out.println("R: " + s);
           return s;
        }
     }
}