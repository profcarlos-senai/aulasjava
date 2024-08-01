/*
Numeros5: pergunte quantas pessoas na sala e quantas faltaram e
  calcule a percentagem de faltantes
  pessoas e faltantes deve ser int e percentual deve ser float ou double
  pra vc ser obrigado a converter de int para float ou double

  fórmula do percentual: parte/tudo*100
 */

import java.util.Scanner;

class AlunosFaltantes {
    private static Scanner leitor = new Scanner(System.in);

    private int alunos, faltaram;
    private double percent;

    private int digitaInteiro(String texto){
        System.out.print(texto);
        return leitor.nextInt();
    }

    private double calcPercentagem(int parte, int todo){
        return (double)parte/todo*100.0;
    }

    private void imprimeResultado(double percFantantes){
        System.out.printf("%.1f%% dos alunos faltaram", percFantantes);
    }

    public void FazCalculo(){
        digita();
        calcula();
        imprime();
    }

    private void digita() {
        // pergunta quantas pessoas e quantos faltaram
        alunos = digitaInteiro("Quantos alunos: ");
        faltaram = digitaInteiro("Quantos faltaram: ");
    }

    private  void calcula(){
        // calcula o percentual de faltas
        percent = calcPercentagem(faltaram, alunos);
    }

    private  void imprime(){
        // imprime
        imprimeResultado(percent);
    }
}

public class Numeros5c {

    public static void main(String[] args) {
        var calculadora = new AlunosFaltantes();
        calculadora.FazCalculo();
    }
}
