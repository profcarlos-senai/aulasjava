/*
    Um cinema quer um programa para calcular o preço do ingresso
    Vai perguntar a idade e se for menor de 18 paga meia (R$ 13),
     se for maior de 65 (inclusive) paga meia
    os outros pagam inteira (R$ 26)
 */

import java.util.Scanner;

public class Decisão3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
        final double INTEIRA = 26, MEIA = INTEIRA / 2;
        double valorIngresso;

        // digita a idade
        System.out.print("Digite a idade: ");
        idade = teclado.nextInt();

        if (idade < 18) { // é menor?
            valorIngresso = MEIA;
        } else if (idade >= 65) { // é idoso?
            valorIngresso = MEIA;
        } else {
            valorIngresso = INTEIRA;
        }

        // imprime o ingresso
        System.out.printf("Valor a pagar: R$ %.2f\n", valorIngresso);
    }
}
