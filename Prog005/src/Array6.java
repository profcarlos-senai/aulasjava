import java.util.Random;

public class Array6 {
    public static void main(String[] args) {
        // cria um gerador de números aleatórios
        Random chutador = new Random();

        // encha um array de inteiros com números aleatórios de 1 a 100
        int[] numeros = new int[10]; // vetor de 10 inteiros
        for (int i = 0; i < 10; i++) {
            numeros[i] = chutador.nextInt(100); // ele gera de 0 a 99 e eu somei 1 pra ser de 1 a 100
            System.out.printf("%02d ", numeros[i]);
        }
        System.out.println(); // pula linha

        // crie OUTRO vetor de 10 inteiros e copie o vetor numeros de trás pra frente dentro dele
        int[] inverter = new int[10];

        // no fim imprima o invertido
        for (int j = 0; j < 10; j++) {
            inverter[j] = numeros[9-j];
            System.out.printf("%02d ", inverter[j]);
        }
        System.out.println(); // pula linha

    }
}
