import java.util.Scanner;

public class Repetição1 {
    public static void main(String[] args) {
        Scanner teclas = new Scanner(System.in);
        // repetição: comando WHILE
        char resposta = 'S'; // char usa aspas simples e guarda um único caracactere

        while(resposta != 'N'){ // while quer dizer "enquanto"
            System.out.println("Era uma vez um gato chinês.");
            System.out.println("Quer que eu conte outra vez?");
            resposta = teclas.next().toUpperCase().charAt(0); // charAt(n) pega o caractere nº N da string
        }
        System.out.println("Acabou!");
    }
}
