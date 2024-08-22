/**
 * Array.java
 * crie um array de 11 posições contendo a tabuada do 7
 * USANDO UM COMANDO DE REPETIÇÃO (for, while ou do)
 * em cada posição do array tem o múltiplo de 7 do nº da posição
 * depois, imprima o vetor
 */
public class Array4 {
    public static void main(String[] args) {
        final int TAMANHO = 11; // pra pegar o costume de usar constantes

        int[] numero = new int[11]; // cria o vetor

        // enche o vetor com a tabuada
        for (int i = 0; i < TAMANHO; i++) {
           numero[i] = 7*i;
        }

        // imprime o vetor
        for (int i = 0; i < numero.length; i++) { // .length
            System.out.printf("7 x %d = %d\n", i, numero[i]);
        }

    }
}
