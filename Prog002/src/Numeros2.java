import java.util.Scanner;

/*
    Exemplos de divisão entre números inteiros e fracionários
*/
public class Numeros2 {
    public static void main(String[] args) {
        Scanner coisa = new Scanner(System.in);

        // minhas variáveis
        int num1, num2, divisao, resto;
        float decimais;

        // digitar dois numeros
        System.out.println("Digite dois numeros com um espaço no meio");
        num1 = coisa.nextInt();
        num2 = coisa.nextInt();

        // calcular a divisão inteira
        divisao = num1 / num2;
        System.out.println("Divisão = "+divisao);

        // calcular o resto da divisão - use % (ex.: a = b % c ---> a tem o resto de b/c)
        resto = num1 % num2; // "resto recebe o resto de num1/num2"
        System.out.println("O resto é "+resto);

        // calcular a divisão com casas decimais
        decimais = (float)num1 / num2;
        System.out.println("Divisão com casas decimais = "+decimais);
    }
}
