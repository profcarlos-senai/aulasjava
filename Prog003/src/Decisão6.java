import java.util.Scanner;

/*
  Digitar dois numeros e imprimir a diferença entre eles, sem nunca mostrar numeros negativos
*/
public class Decisão6 {
    public static void main(String[] args) {
        Scanner coisinha = new Scanner(System.in);

        // digita um número
        System.out.print("Digite dois numeros separados por um espaço: ");
        int num1 = coisinha.nextInt();
        int num2 = coisinha.nextInt();

        int num3;
        if (num1 > num2){
            num3=num1-num2;
        } else {
            num3=num2-num1;
        }

        // imprime a diferença entre eles
        System.out.printf("Diferença: %d\n", num3);
    }
}
