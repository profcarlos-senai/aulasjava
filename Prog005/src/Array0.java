public class Array0 {
    public static void main(String[] args) {
        final int TAMANHO = 4; // "final" quer dizer que TAMANHO é uma constante

        int[] numeros = new int[TAMANHO];
        numeros[0] = 3;
        numeros[3] = 99;
        numeros[2] = 17;
        numeros[1] = 44;

        for (int i = 0; i < TAMANHO; i++) {
            System.out.printf("%d - %d\n", i, numeros[i]);
        }


    }
}
