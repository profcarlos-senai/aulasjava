import java.util.Scanner;

public class Final1 {

    public static void main(String[] args) {
        final double PERC_DESCONTO = 5.0; // 5% percentual de desconto
        var leitor = new Scanner(System.in);
        int quant = 0;
        double preco, desconto, total;
        double totalGeral=0, totalDesconto=0;
        String opcao;

        do{
            // etapa 1
            // faça um programa que peça quantidade e preço de um produto e calcule o total a pagar
            // em compras acima de R$ 1000 ou com quantiadade acima de 100 tem desconto de 5%
            System.out.print("Quantidade: "); quant = leitor.nextInt();
            System.out.print("Preço: "); preco = leitor.nextDouble();

            total = quant*preco;
            desconto = 0;

            System.out.printf("Você comprou %d trequinhos a R$ %.2f cada. Total = R$ %.2f\n", quant, preco, total);
            if((quant>100) || (total>=1000.0)){
                desconto = total*PERC_DESCONTO/100.0; // calcula o desconto
                total -= desconto; // desconta do total
                System.out.printf("Você ganhou %.1f%% de desconto (R$ %.2f). Total com desconto = R$ %.2f\n",
                        PERC_DESCONTO, desconto, total);
            }

            totalGeral += total; // acumula o total
            totalDesconto += desconto; // acumula os descontos

            // etapa 2
            // quando isso estiver pronto, pergunte se vai comprar mais produtos e se responder sim, repita
            // no final imprima o total de valores pagos e o total de descontos concedidos
            System.out.println();
            System.out.print("Quer continuar?");
            opcao = leitor.next();

        }while(opcao.equalsIgnoreCase("sim") || opcao.equalsIgnoreCase("s"));

        System.out.println();
        System.out.printf("Total geral: %.2f\n", totalGeral);
        System.out.printf("Total descontos: %.2f\n", totalDesconto);

    }
}
