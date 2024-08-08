import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        // primeiro faça um programa pra contar do 4 até o 11
        // coloque o inicio (4) e o fim (11) em variáveis
        // depois mude pra pra pedir pra digitar o inicio e o fim
        // em vez de usar sempre os mesmos numeros
        // agora faça imprimir o caminho de volta do fim até o inicio
        // quer dizer, primeiro de inicio ao fim e depois do fim ao inicio
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite dois numeros: ");
        int ini = leitor.nextInt();
        int fim = leitor.nextInt();

        // imprime do ini ao fim
        for(int i = ini; i <= fim; i++){
            System.out.print(i + " ");
        }
        System.out.println(); // pula linha

        // imprime do fim ao ini
        for(int i = fim; i >= ini; i--){
            System.out.print(i + " ");
        }
    }
}
