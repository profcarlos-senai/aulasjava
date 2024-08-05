import java.util.Scanner;

public class Repetição3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // o computador chuta um numero entre 1 e 5
        int numero = 1 + Math.round(4*(float)Math.random());
        int chute;
        int vezes = 0;

        // agora repete até você adivinhar o número
        do{ // repetição com teste no final
            System.out.println("Chute um numero de 1 a 5: ");
            chute = leitor.nextInt();
            if(numero != chute){
                System.out.println("Errooooou!");
            }
            vezes++; // soma 1 em vezes (mesmo que vezes = vezes + 1;)
        }while(chute != numero);
        System.out.println("Acertou em "+vezes+" tentativas");
    }
}
