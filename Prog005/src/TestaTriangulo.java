public class TestaTriangulo {
    public static void main(String[] args) {
        Triangulo coisa = new Triangulo(2,3,4); // cria um objeto do tipo Triangulo e coloca na variável "coisa"

        coisa.a = 3;

        if(coisa.éTriangulo()){
            System.out.println("É um triângulo.");

            if(coisa.éEquilátero()) System.out.println("Equilátero");
            if(coisa.éIsósceles()) System.out.println("Isósceles");
            if(coisa.éEscaleno()) System.out.println("Escaleno");
            System.out.println("O perímetro é "+coisa.perimetro());
            System.out.println("A área é "+coisa.area());

        } else {
            System.out.println("Não é um triângulo.");
        }
    }
}
