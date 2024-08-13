/*
- peça a cotação do dólar e o preço do produto em dólar
  e imprima o preço em reais
  ex: dólar: 5,50 preço: 2
      Preco em R$: 11,0

 Todas as variáveis são float e puxa com nextFloat()
 ou double e puxa com nextDouble()
 */

import java.util.Scanner;

public class Funções2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // variáveis
        float cotação, preço, reais;

        // digitar cotação
        System.out.println("Qual a cotação do dólar hoje?");
        cotação = leitor.nextFloat();

        // digitar preço
        System.out.println("Quanto custa o trequinho?");
        preço = leitor.nextFloat();

        // calcular valor em reais
        reais =  preço * cotação;

        // imprimir valor em reais
        System.out.println("R$: "+reais);
        System.out.printf("Valor em R$: %.2f",reais);
    }
}
