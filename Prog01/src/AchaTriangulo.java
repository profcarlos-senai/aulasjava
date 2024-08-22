public class AchaTriangulo {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            double c = i;
            double h = Math.sqrt(2*(c*c));

            System.out.printf("A=%22.20f, B=%22.20f, C=%22.20f\n", c, c, h);
            System.out.println();
        }
    }
}
