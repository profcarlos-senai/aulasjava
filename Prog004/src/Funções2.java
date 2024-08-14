import java.util.Scanner;

public class Funções2 {

    static float calculaPerc(float parte, float todo){
        float percentual = parte/todo*100;
        return percentual;
    }

    public static void main(String[] args) {
        // faça um programa pergunte total de alunos, quantos alunos faltaram e
        Scanner teclado = new Scanner(System.in);
        System.out.print("Total de alunos: ");
        int total = teclado.nextInt();
        System.out.print("Quantos faltaram: ");
        int faltas = teclado.nextInt();

        // calcule quantos % faltaram
        // exemplo: 40 alunos faltaram 8, são 20%
        float percFaltas = calculaPerc(faltas, total);
        System.out.printf("%.1f %% dos alunos faltaram\n", percFaltas);
    }
}