import java.util.Scanner;

/*
  Pedir pra digitar um inteiro e dizer se é par ou ímpar
  (números pares dão resto zero quando divididos por 2)
*/
public class Decisão5 {
    public static void main(String[] args) {
        Scanner coisinha = new Scanner(System.in);

        // digita um número
        System.out.print("Digite um número: ");
        int numero = coisinha.nextInt();

        // diz se ele é par ou impar
        if(numero % 2 == 0){ // é par
            System.out.println("É par");
        }
        else{ // é impar
            System.out.println("É ímpar");
        }
    }
}
