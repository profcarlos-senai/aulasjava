/*
Triangulo.java
Um objeto que guarda os lados de um triangulo
 */

public class Triangulo {
    double a,b,c; // três (possíveis) lados

    public Triangulo(double a, double b, double c){ // essa função é o CONSTRUTOR da classe
        this.a = a; // this sou eu mesmo (esse triangulo)
        this.b = b;
        this.c = c;
    }

    public boolean éTriangulo(){ // retorna true se for um triângulo, false se não
        return (a < b + c && b < c + a && c < a + b);
    }

    public boolean éEquilátero(){
        return (a==b && b==c); // retorna true se for equilátero
    }

    public boolean éIsósceles(){
        return !éEquilátero() && (a==b || a==c || b==c);
    }

    public boolean éEscaleno(){
        return !éEquilátero() && !éIsósceles();
    }

    public double perimetro(){ // calcula o perímetro desse triângulo
        return a+b+c; // escreva você essa fórmula aqui
    }

    public double area(){ // a tal da fórmula de heron
        double p = perimetro()/2.0; // esse .0 converte de int pra double
        return Math.sqrt( p * (p-a)*(p-b)*(p-c) ); // Math.sqrt é raiz quadrada
    }
}
