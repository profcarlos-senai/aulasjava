import java.util.Scanner;

public class Decisão8 {
    public static void main(String[] args) {
        /*
        Escreva um programa que leia quatro notas escolares de um aluno e
        apresentar uma mensagem que o aluno foi aprovado se o valor da média
        escolar for maior ou igual a 7.

        Se o valor da média for menor que 7, solicitar a nota do recuperação,
        somar com o valor da média e obter a nova média.

        Se a nova média for maior ou igual a 7, apresentar uma
        mensagem informando que o aluno foi aprovado na recuperação.
        Se o aluno não foi aprovado, apresentar uma mensagem informando esta
        condição. Apresentar junto com as mensagens o valor da média do aluno.

        M = (n1+n2+n3+n4)/4
        MF = (M+R)/2
        */

        Scanner teclado = new Scanner(System.in);
        float n1, n2, n3, n4, media, recupera, mediaFinal;

        // pedir notas
        System.out.print("Digite quatro notas: ");
        n1 = teclado.nextFloat();
        n2 = teclado.nextFloat();
        n3 = teclado.nextFloat();
        n4 = teclado.nextFloat();

        // calcular média
        media = (n1+n2+n3+n4)/4;
        media = Math.round(media*10)/10.0f; // arredonda com 1 casa
        System.out.printf("Média: %.1f", media);

        // dizer se foi aprovado
        if(media >= 7.0) {
            System.out.println("- Aprovado");
        } else {
            // se pegou recuperação:
            System.out.println(" - Em recuperação");
            // pedir nota da recuperação
            System.out.print("Digite a nota da recuperação: ");
            recupera = teclado.nextFloat();

            // calcular média final
            mediaFinal = (media+recupera)/2;
            mediaFinal = Math.round(mediaFinal*10)/10.0f; // arredonda com 1 casa
            System.out.printf("Média final: %.1f", mediaFinal);

            // dizer se foi aprovado
            if (mediaFinal >= 7){
                System.out.println(" - Aprovado!");
            } else {
                System.out.println(" - Reprovado!");
            }
        }
    }
}
