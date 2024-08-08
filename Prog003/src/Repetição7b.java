import java.util.Scanner;

public class Repetição7b {
    public static void main(String[] args) {
        // imprimir todas as tabuadas

        int numero = 1;
        while(numero<=10) {
            int conta = 1;
            while (conta <= 10) {
                System.out.printf("%2d x %2d = %3d\n", numero, conta, numero * conta);
                conta++;
            }
            System.out.println(); // pula uma linha
            numero++;
        }
    }
}
