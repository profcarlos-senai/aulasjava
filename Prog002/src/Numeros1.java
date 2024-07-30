import java.util.Scanner;

/*
Peça pra digitar dois números e imprima a soma
*/
public class Numeros1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // digita um numero
        System.out.print("Digite um numero: ");
        var num1 = scanner.nextInt(); // nextInt puxa um numero inteiro do teclado

        // digita outro numero
        System.out.print("Digite um numero: ");
        var num2 = scanner.nextInt();

        // calcule a soma (+), a diferenca (-), a divisao (/) a o produto (*) dos numeros
        int soma = num1 + num2;
        int dife = num1 - num2;
        int mult = num1 * num2;
        int divi = num1 / num2;

        // imprime o resultado
        System.out.println("A soma é "+soma);
        System.out.println("A diferença é "+dife);
        System.out.println("O produto é "+mult);
        System.out.println("A divisão é "+divi);

        // imprime usando printf
        System.out.printf("Soma:      %05d\tDiferença: %d\nProduto:   %5d\tDivisão:   %3d\n",
                soma, dife, mult, divi);
    }
}
