import java.util.Scanner;

/*
Numeros4: um fazendeiro quer um programa onde ele informe quantos ovos recolheu
  e calcule quantas dúzias de ovos ele vai poder mandar pro mercado, e quantos sobraram

  ex: recolheu 147 ovos
      12 dúzias e sobraram 3 ovos
 */
public class Numeros4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // pergunta quantos
        System.out.print("Quantos ovos?");
        int ovos = leitor.nextInt();

        // calcula
        int duzias = ovos / 12;
        int sobra = ovos % 12;

        // dá o resultado
        System.out.printf("Isso dá %d dúzias e sobram %d ovos", duzias, sobra);
    }
}
