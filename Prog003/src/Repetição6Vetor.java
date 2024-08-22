import java.util.Scanner;

public class Repetição6Vetor {


    // um elevador tem limite de 300kg
    // peça o peso de cada pessoa que entrar e imprima o total até agora
    // quando encher imprimir "SUBINDO!" e o peso total
    // cada pessoa que PODE ENTRAR, adicionar no vetor, e imprimir no final o peso de cada um

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int total=0;
        int pessoas[] = new int[6];
        int x = 0;

        while(total <= 300) {  // repete até encher
            // pergunta o peso
            System.out.print("Qual o seu peso? ");
            pessoas[x] = leitor.nextInt();
            total = total + pessoas[x];
            x++;
        } // acabou o while aqui

        // se estourou o peso chuta uma pessoa pra fora
        if(total > 300){
            x--; // volta um pq o último não pode entrar
            total = total - pessoas[x]; // desconta o peso do cara que não entrou
            pessoas[x] = 0;
        }

        // no final diz que tá subindo e a soma e lista o vetor
        System.out.printf("Subindo com %d pessoas! Peso total: %d kg\n", x, total);
        for (int i = 0; i < x; i++) {
            System.out.printf("Pessoa %d: %d kg\n", i+1, pessoas[i]);
        }
    }
}
