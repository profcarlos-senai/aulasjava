import java.util.Scanner;

public class Repetição6c {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int peso=0, total=0;

        // um elevador tem limite de 300kg
        // peça o peso de cada pessoa que entrar e imprima o total até agora
        // quando encher imprimir "SUBINDO!" e o peso total

        System.out.println("Qual o seu peso? ");
        peso = leitor.nextInt();

        while(peso+total < 300) {  // repete até encher
            total = total + peso; // deixei o cara da vez passada entrar
            // pergunta o peso pra próxima rodada (se tiver)
            System.out.println("Qual o seu peso? ");
            peso = leitor.nextInt();

            if(peso+total > 300){
                System.out.println("Excesso de peso, não pode entrar");
            }
        } // acabou o while aqui

        // no final diz que tá subindo e a soma
        System.out.printf("SUBINDO! Peso total: %d kg\n", total);
    }
}
