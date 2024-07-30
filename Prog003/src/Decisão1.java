import java.util.Scanner;

/*
Numero7: um vendedor quer calcular o desconto de um produto. ele vai informar o
  preço em reais. SE o preço for maior que R$ 1000,  pedir o percentual de desconto
  e o programa deve dizer quantos reais  de desconto e qual o valor a pagar
  ex: produto de R$ 80 (não vai pedir desconto) e o preço final é R$ 80,00
  ex: o preço é 2000. O desconto é 5%, que dá R$ 100 e o preço final é 1900
 */
public class Decisao1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // variáveis
        double precoReais, porcentagemDesconto, reaisDesconto, valorPagar;

        // digita preço
        System.out.print("Preço (R$): ");
        precoReais = leitor.nextDouble();
        valorPagar = precoReais; // caso não entre no IF, garantir que tenha um valor

        // preço é maior que 1000?
        if (precoReais >= 1000) {
            // sim - pede o desconto
            System.out.print("Desconto (%): ");
            porcentagemDesconto = leitor.nextDouble();

            // calcula desconto em reais e preço final
            reaisDesconto = precoReais * (porcentagemDesconto/100);
            valorPagar = precoReais - reaisDesconto;

            // imprime resultado
            System.out.printf("O desconto é de R$ %.2f\n", reaisDesconto);
        } // acabou o IF

        // imprime o valor a pagar
        System.out.printf("Valor a pagar: R$ %.2f\n", valorPagar);
    }
}
