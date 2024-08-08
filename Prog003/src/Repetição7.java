import java.util.Scanner;

public class Repetição7 {
    public static void main(String[] args) {
        // pedir um número e imprimir a tabuada dele
        // 1x7, 2x7, 3x7... 10x7
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = leitor.nextInt();

        int conta = 1;
        while(conta <= 10){
            System.out.printf("%2d x %2d = %3d\n", numero, conta, numero*conta);
            conta++;
        }
    }
}
