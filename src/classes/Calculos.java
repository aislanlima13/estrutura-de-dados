package classes;

import java.util.Scanner;

class Calculos {

    private static double a, b, c, d, x1, x2;

    public void insereValores(){
        Scanner le = new Scanner(System.in);

         System.out.print("Informe o valor de a: ");
         a = le.nextInt();

         System.out.print("Informe o valor de b: ");
         b = le.nextInt();

         System.out.print("Informe o valor de c: ");
         c = le.nextInt();
    }

    public double calculaDelta(){
        d = (b * b - 4) * a * c;
        return d;
    }

    public void calculaRaizes(){
        x1 = (-b + Math.sqrt(d)) / (2 * a);
        x2 = (-b - Math.sqrt(d)) / (2* a);
        
        System.out.println("O valor de X1 é: " + x1 + "\n" + "O valor de x2 é: " + x2);
    }
}