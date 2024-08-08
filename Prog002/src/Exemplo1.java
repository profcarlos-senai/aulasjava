import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        /*
        classificar um atleta em categorias dependendo do peso
        pena: abaixo de 57kg
        médio: de 57 a 77
        meio-pesado: 77 a 85
        pesado: acima de 85
        */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        float peso = teclado.nextFloat();

        if(peso < 57){
            System.out.println("Pena");
        } else if (peso < 77) {
            System.out.println("Médio");
        } else if (peso < 85) {
            System.out.println("Meio-pesado");
        } else {
            System.out.println("Pesado");
        }
    }
}
