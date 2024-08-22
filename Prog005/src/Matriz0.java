public class Matriz0 {
    public static void main(String[] args) {
        int[][] tabuada = new int[11][11]; // todas as tabuadas;

        for (int i = 0; i <= 10; i++) { // tabuada de 0 a 10
            for (int j = 0; j <= 10; j++) { // i x os valores de 0 a 10
                tabuada[i][j] = i*j;
            } // aumenta o J
        } // aumenta o I

        System.out.println(tabuada[3][7]);
    }
}
