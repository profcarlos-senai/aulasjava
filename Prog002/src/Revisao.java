import java.util.Scanner;

public class Revisao {
    public static void main(String[] args) {
        // diz pro java quais são as minhas variáveis
        String nome, cidade;

        // cria o treco de digitar
        Scanner teclas = new Scanner(System.in);

        System.out.print("Qual o seu nome? ");
        nome = teclas.nextLine();
        System.out.print("Onde vc mora? ");
        cidade = teclas.nextLine();
        System.out.println("Oi, eu sou o "+nome+" e moro em "+cidade);
    }
}