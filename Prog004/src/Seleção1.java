import java.util.Scanner;

public class Seleção1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Escolha um numero de 1 a 3: ");
        int opção = leitor.nextInt();

        switch (opção){
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
