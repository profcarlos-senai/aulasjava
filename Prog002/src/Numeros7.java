import java.util.Scanner;

/*
Numero7: um vendedor quer calcular o desconto de um produto. ele vai informar o
  preço em reais e o percentual de desconto e o programa deve dizer quantos reais
  de desconto e qual o valor a pagar
  ex: produto de R$ 80 com 20% de desconto
  o desconto é de R$ 16,00 e o preço final é R$ 64,00
 */
public class Numeros7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // variáveis
        double precoReais, porcentagemDesconto, reaisDesconto, valorPagar;

        // digita preço e percentual de desconto
        System.out.print("Preço (R$): ");
        precoReais = leitor.nextDouble();

        System.out.print("Desconto (%): ");
        porcentagemDesconto = leitor.nextDouble();

        // calcula desconto em reais e preço final
        reaisDesconto = precoReais * (porcentagemDesconto/100);
        valorPagar = precoReais - reaisDesconto;

        // imprime resultado
        System.out.printf("O desconto é de R$ %.2f e o valor a pagar é R$ %.2f",
                reaisDesconto, valorPagar);
    }
}
