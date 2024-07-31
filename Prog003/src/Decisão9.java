import java.util.Scanner;

public class Decisão9 {
    /*
    Pra saber se três números representam o comprimento dos lados de um triângulo,
    cada número tem que ser menor que a soma dos outros dois

    peça três números e diga se eles fazem um triângulo ou não.
    */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ladoA=3, ladoB=4, ladoC=5;
        boolean okA, okB, okC;

        okA = (ladoA < ladoB+ladoC);
    }
}
