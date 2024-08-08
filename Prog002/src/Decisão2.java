/*
    Um cinema quer um programa para calcular o preço do ingresso
    Vai perguntar a idade e se for menor de 18 paga meia (R$ 13)
    caso contrário paga inteira (R$ 26)
 */

import java.util.Scanner;

public class Decisão2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
        double valorIngresso = 26;

        // digita a idade
        System.out.print("Digite a idade: ");
        idade = teclado.nextInt();

        // se for menor de idade paga meia
        if(idade < 18){
            valorIngresso = 13;
        }

        // imprime o ingresso
        System.out.printf("Valor a pagar: R$ %.2f\n", valorIngresso);
    }
}
