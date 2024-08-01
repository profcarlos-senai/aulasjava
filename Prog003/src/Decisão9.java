import java.util.Scanner;

public class Decisão9 {
    /*
    Pra saber se três números representam o comprimento dos lados de um triângulo,
    cada número tem que ser menor que a soma dos outros dois

    peça três números e diga se eles fazem um triângulo ou não.
    */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c;

        System.out.print("Digite os tres lados: ");
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            System.out.println("É um triângulo");

            // descobre se é equilátero
            if ((a == b) && (b == c)) {
                System.out.println("é equilátero");
            } else if ((a == b) || (a == c) || (b == c)) {
                System.out.println("é isósceles");
            } else {
                System.out.println("Escaleno");
            }
        // ver se é retângulo (testa se bate o teorema de pitágoras a=b²+c²
        if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
            System.out.println("É um triângulo retângulo");
        }

    } else  {
        System.out.println("Não é um triângulo");
    }
}
}
