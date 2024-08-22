import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        // uma empresa de aluguel de carros tem 3 categorias de veículos:
        // luxo: R$ 500,00/dia, empresarial: R$ 300,00/dia e popular: R$ 200,00/dia
        // crie um vetor de 3 posições float com o preço de cada categoria
        // pergunte qual a categoria de carro (1, 2, 3), quantos dias vai ficar
        // e imprima quanto vai custar
        String[] nomeCateg = {"Luxo","Empresarial","Popular"};
        float preço[] = {500,300,200};

        Scanner leitor = new Scanner(System.in);

        System.out.print("Escolha categoria (1 a 3): ");
        int categ = leitor.nextInt();
        System.out.print("Quantos dias: ");
        int dias = leitor.nextInt();

        float total = dias * preço[categ-1];
        System.out.printf("Total para %d dias na categoria %s: R$ %.2f\n", dias, nomeCateg[categ-1], total);

    }
}
