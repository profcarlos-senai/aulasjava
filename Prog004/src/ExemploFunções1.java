/*
- peça a cotação do dólar e o preço do produto em dólar
  e imprima o preço em reais
  ex: dólar: 5,50 preço: 2
      Preco em R$: 11,0

 Todas as variáveis são float e puxa com nextFloat()
 ou double e puxa com nextDouble()
 */

import java.util.Scanner;

public class ExemploFunções1 {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        float cotação = digitaFloat("Qual a cotação do dólar hoje?");
        float preço = digitaFloat("Quanto custa o trequinho?");
        float reais =  converte(preço, cotação);
        imprimeResultado(preço, cotação, reais);
    }

    private static float digitaFloat(String s) {
        System.out.println(s);
        return leitor.nextFloat();
    }

    private static float converte(float preço, float cotação) {
        return preço * cotação;
    }

    private static void imprimeResultado(float preço, float cotação, float reais){
        System.out.printf("O valor $%.2f com a cotação %.2f fica R$ %.2f",
                preço, cotação, reais);
    }
}

