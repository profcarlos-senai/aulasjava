public class Exemplo2 {
    public static void main(String[] args) {

        // arredonda um double usando string format
        double valor = 654.325;
        double redondo = (long)(valor*100+0.5)/100.0;

        System.out.printf("original: %f\narredondado: %f", valor, redondo);
    }
}
