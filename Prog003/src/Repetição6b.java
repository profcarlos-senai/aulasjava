import java.util.Scanner;

public class Repetição6b {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int peso=0, total=0;

        // um elevador tem limite de 300kg
        // peça o peso de cada pessoa que entrar e imprima o total até agora
        // quando encher imprimir "SUBINDO!" e o peso total

        while(peso+total < 300) {  // repete até encher
            // pergunta o peso
            System.out.println("Qual o seu peso? ");
            peso = leitor.nextInt();

            // decide se pode entrar
            if(total+peso <= 300) { // pode subir
                total = total + peso;
                peso = 0; // pra não testar dobrado no while
            } else {
                System.out.println("Não pode entrar, gorducho.");
            }
        } // acabou o while aqui


        // no final diz que tá subindo e a soma
        System.out.printf("SUBINDO! Peso total: %d kg\n", total);
    }
}
