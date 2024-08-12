import java.util.Scanner;

// pede pra digitar um numero inteiro e retorna o valor digitado
public class Numeros1_funções {
    static Scanner teclado = new Scanner(System.in);

    static int digitaInteiro(){
        System.out.print("Digite um numero: ");
        return teclado.nextInt(); // devolve o numero digitado
    }

    static void fazCalculos(int x, int y){
        int soma = x + y;
        int dife = x - y;
        int mult = x * y;
        int divi = x / y;

        // imprime o resultado
        System.out.println("A soma é "+soma);
        System.out.println("A diferença é "+dife);
        System.out.println("O produto é "+mult);
        System.out.println("A divisão é "+divi);
    }

    /*
    Peça pra digitar dois números e imprima a soma
    */
    public static void main(String[] args) {

        // digita um numero
        var num1 = digitaInteiro();
        var num2 = digitaInteiro();

        // calcule a soma (+), a diferenca (-), a divisao (/) a o produto (*) dos numeros
        fazCalculos(num1, num2);
    }
}
