import java.util.Scanner;

public class Repetição2 {
    public static void main(String[] args) {
        Scanner teclas = new Scanner(System.in);
        // repetição: comando WHILE
        char resposta = 'S'; // char usa aspas simples e guarda um único caracactere

        while(resposta == 'S'){ // while quer dizer "enquanto"
            System.out.println("Era uma vez um gato chinês.");

            do { // faz o mesmo que um WHILE mas não testa na entrada, só na saída
                System.out.println("Quer que eu conte outra vez?");
                resposta = teclas.next().toUpperCase().charAt(0); // charAt(n) pega o caractere nº N da string
                if (resposta != 'S' && resposta != 'N') {
                    System.out.println("Digite apenas 'S' ou 'N'.");
                }
            } while(resposta != 'S' && resposta != 'N');
        }
        System.out.println("Acabou!");
    }
}
