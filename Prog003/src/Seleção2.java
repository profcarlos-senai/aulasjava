import java.util.Scanner;

public class Seleção2 {
    public static void main(String[] args) {
//        enum TipoVeiculo {ALUGADO, PROPRIO}
//
//        TipoVeiculo deles = TipoVeiculo.ALUGADO;
//        TipoVeiculo meu = TipoVeiculo.PROPRIO;
//
//        switch(meu){
//            case ALUGADO:
//        }

        Scanner leitor = new Scanner(System.in);

        System.out.print("Escolha uma letra entre A e C: ");
        char opção = leitor.next().charAt(0);

        switch (opção){
            case 'a':
            case 'A':
                System.out.println("Um");
                break;
            case 'b','B':
                System.out.println("Dois");
                break;
            case 'c','C':
                System.out.println("Três");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
