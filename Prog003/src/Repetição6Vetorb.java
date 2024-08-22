import java.util.Scanner;

public class Repetição6Vetorb {


    // um elevador tem limite de 300kg
    // peça o peso de cada pessoa que entrar e imprima o total até agora
    // quando encher imprimir "SUBINDO!" e o peso total
    // cada pessoa que PODE ENTRAR, adicionar no vetor, e imprimir no final o peso de cada um

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int peso=0, total=0;
        int pessoas[] = new int[6];
        int x = 0;

        while(total <= 300) {  // repete até encher
            // pergunta o peso
            System.out.print("Qual o seu peso? ");
            peso = leitor.nextInt();
            total = total + peso;
            if(total <= 300){
                pessoas[x] = peso; // só adiciona os magrelo
                x++;
            }
        } // acabou o while aqui

        // quando estourou o peso chuta a ultima pessoa pra fora
        System.out.println("Elevador lotado. Subindo!");
        total = total - peso; // desconta o peso do cara que não entrou

        // no final diz que tá subindo e a soma e lista o vetor
        System.out.printf("Subindo com %d pessoas! Peso total: %d kg\n", x, total);
        for (int i = 0; i < x; i++) {
            System.out.printf("Pessoa %d: %d kg\n", i+1, pessoas[i]);
        }
    }
}
