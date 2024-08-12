/*
Numeros5: pergunte quantas pessoas na sala e quantas faltaram e
  calcule a percentagem de faltantes
  pessoas e faltantes deve ser int e percentual deve ser float ou double
  pra vc ser obrigado a converter de int para float ou double

  fórmula do percentual: parte/tudo*100
 */

import java.util.Scanner;

public class Numeros5b {
    static Scanner leitor = new Scanner(System.in);

    static int digitaInteiro(String texto){
        System.out.print(texto);
        return leitor.nextInt();
    }

    static double calcPercentagem(int parte, int todo){
        return (double)parte/todo*100.0;
    }

    static void imprimeResultado(double percFantantes){
        System.out.printf("%.1f%% dos alunos faltaram", percFantantes);
    }

    public static void main(String[] args) {

        int alunos, faltaram;
        double percent;

        // pergunta quantas pessoas e quantos faltaram
        alunos = digitaInteiro("Quantos alunos: ");
        faltaram = digitaInteiro("Quantos faltaram: ");

        // calcula o percentual de faltas
        percent = calcPercentagem(faltaram, alunos);

        // imprime
        imprimeResultado(percent);
    }
}
