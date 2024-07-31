import java.util.Scanner;

public class Decisão9 {
    /*
    Pra saber se três números representam o comprimento dos lados de um triângulo,
    cada número tem que ser menor que a soma dos outros dois

    peça três números e diga se eles fazem um triângulo ou não.
    */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a,b,c;

        System.out.print("Digite os tres lados: ");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();

        if( (a<b+c) && (b<a+c) && (c<a+b)){
            System.out.println("É um triângulo");

            // descobre se é equilátero
            if( (a==b) && (b==c)){
                System.out.println("é equilátero");
            } else if ( (a==b && b!=c) || (a==c && c!=b) || (b==c && c!=a)) {
                System.out.println("é isósceles");
            } else {
                System.out.println("Escaleno");
            }

        } else {
            System.out.println("Não é um triângulo");
        }
    }
}
