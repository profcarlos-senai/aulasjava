import java.util.Scanner;

public class Decisão4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome1, nome2;
        int idade1, idade2;

        System.out.print("Digite um nome: "); nome1 = teclado.next();
        System.out.print("Digite uma idade: "); idade1  = teclado.nextInt();

        System.out.print("Digite outro nome: "); nome2 = teclado.next();
        System.out.print("Digite outra idade: "); idade2  = teclado.nextInt();

        if (idade1 > idade2){
            System.out.println("A pessoa mais velha é "+nome1);
        }
        else{
            if(idade2 > idade1) {
                System.out.println("A pessoa mais velha é " + nome2);
            }
            else {
                System.out.println("As duas idades são iguais");
            }
        }
    }
}
