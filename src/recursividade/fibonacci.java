package recursividade;

public class fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            System.out.print("(" + i + "):" + f(i) + "\t");
        }
    }

    private static long f(int n) {
        if (n < 2) {
            return n;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }
}
