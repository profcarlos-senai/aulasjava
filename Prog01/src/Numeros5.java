/*
Numeros5: pergunte quantas pessoas na sala e quantas faltaram e
  calcule a percentagem de faltantes
  pessoas e faltantes deve ser int e percentual deve ser float ou double
  pra vc ser obrigado a converter de int para float ou double

  fórmula do percentual: parte/tudo*100
 */

import java.util.Scanner;

public class Numeros5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int alunos, faltaram;
        double percent;

        // pergunta quantas pessoas e quantos faltaram
        System.out.print("Quantos alunos: ");
        alunos = leitor.nextInt();
        System.out.print("Quantos faltaram: ");
        faltaram = leitor.nextInt();

        // calcula o percentual de faltas
        percent = (double)faltaram / alunos * 100;

        // imprime
        System.out.printf("%.1f%% dos alunos faltaram", percent);
    }
}
