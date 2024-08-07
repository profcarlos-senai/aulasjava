import java.util.Scanner;

public class Repetição9 {
    public static void main(String[] args) {
        // considerando que .charAt(n) pega o enésimo caractere de uma String
        // e que .length() pega o tamanho de uma string
        // peça para digitar um nome e imprima de tras para frente
        // dica: use %c para imprimir um único caractere com printf

        Scanner leitor = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = leitor.nextLine();
        System.out.printf("Esse nome tem %d letras\n", nome.length());
        int ultima = nome.length()-1; // começa no zero

        // agora substitua isso por imprimir as letras de tras pra frente
        System.out.printf("Última letra: %c", nome.charAt(ultima));
    }
}
