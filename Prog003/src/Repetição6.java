import java.util.Scanner;

public class Repetição6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int peso=0, total=0;

        // um elevador tem limite de 300kg
        // peça o peso de cada pessoa que entrar e imprima o total até agora
        // quando encher imprimir "SUBINDO!" e o peso total

        while(total < 300) {  // repete até encher
            // pergunta o peso
            System.out.println("Qual o seu peso? ");
            peso = leitor.nextInt();
            total = total + peso; // deixei esse cara entrar
        } // acabou o while aqui

        // se estourou o peso chuta uma pessoa pra fora
        if(total > 300){
            System.out.println("Excesso de peso, você não pode entrar");
            total = total - peso; // chuta o ultimo cara pra fora
        }

        // no final diz que tá subindo e a soma
        System.out.printf("SUBINDO! Peso total: %d kg\n", total);
    }
}
