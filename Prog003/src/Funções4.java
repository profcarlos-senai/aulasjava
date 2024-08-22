import java.util.Scanner;

public class Funções4 {

    // faça uma função int dobro(int n) que retorne o dobro de n
    private static int dobro(int n) {
        return n*2;
    }

    public static void main(String[] args) {
        System.out.println( dobro(3) ); // posso imprimir o resultado de uma função
        System.out.println( dobro(8) );
        int x = dobro(1);               // posso jogar o resultado da função numa variável
        System.out.println(x);
        int valor = dobro(4)/x; // posso fazer cálculos com o resultado da função pq é um valor qualquer
        System.out.println(valor);

        Scanner teclas = new Scanner(System.in);
        String nome = teclas.next();
        System.out.println(dobro( nome.length() ));
    }

}
