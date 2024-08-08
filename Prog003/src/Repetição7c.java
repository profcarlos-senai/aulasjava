public class Repetição7c {

    static void tabuada(int n){
        int conta = 1;
        while (conta <= 10) {
            System.out.printf("%2d x %2d = %3d\n", n, conta, n * conta);
            conta++;
        }
    }

    static void todasTabuadas(){
        // imprimir todas as tabuadas
        int numero = 1;
        while(numero<=10) {
            tabuada(numero);
            System.out.println(); // pula uma linha
            numero++;
        }
    }

    public static void main(String[] args) {
        todasTabuadas();
    }
}
