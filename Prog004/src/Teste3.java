import java.util.Scanner;

public class Teste3 {
    public static void main(String[] args) {
        Scanner teclas = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        char letra = teclas.next().charAt(0);

        if(letra == 'X'){
            System.out.println("xis!");
        }

        System.out.println("Tchau");
    }
}
