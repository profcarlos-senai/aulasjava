public class Repetição5 {
    public static void main(String[] args) {
        // imprimir as temperaturas em Celsius de 0 a 100 de 5 em 5 graus
        // e o equivalente em Fahrenheit sabendo que 5C = 9F
        double grausC=0, grausF;

        while(grausC <= 100){
            grausF = grausC * (9.0/5)+32;
            System.out.printf("C = %4.0f\tF = %4.0f\n", grausC, grausF);
            grausC = grausC + 5;
        }
    }
}