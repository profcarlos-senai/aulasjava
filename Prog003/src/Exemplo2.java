public class Exemplo2 {
    static double arredonda(double numero, int casas) {
        double pot10 = Math.pow(10, casas);
        return Math.round(numero * pot10) / pot10;
    }

    public static void main(String[] args) {
        // arredondamento
        double num1 = 6.169999;

        System.out.printf("num1 com arredondamento só no printf: %.1f\n", num1);
        System.out.printf("num1 com arredondamento só no printf: %.3f\n", num1);
        System.out.printf("num1 sem arredondar %f\n", num1);

        double redondo = Math.round(num1 * 100) / 100.0;
        System.out.printf("redondo sem arredondar %f\n", redondo);

        // criando uma função
        System.out.printf("usando a função arredonda() %f\n", arredonda(num1, 3));
    }
}
