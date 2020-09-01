package classes;

public class bhaskara{
    public static void main(String[] args) {
        Calculos calculo = new Calculos();
        calculo.insereValores();
        double delta = calculo.calculaDelta();

        if(delta < 0)-
            System.out.println("Delta menor que zero!");
        else
            calculo.calculaRaizes();
    }
}