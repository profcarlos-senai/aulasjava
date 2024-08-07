public class FizzBuzz {
    public static void main(String[] args) {
        // Imprimir os numeros de 1 a 100
        // se for multiplo de 3 imprimir "Fizz" atrás do número
        // se for multiplo de 5 imprimir "Buzz" atrás do número
        // (isso quer dizer que números que são multiplos de 3 e 5 ao mesmo tempo
        // vão ter "FizzBuzz" atrás deles)

        int n=1;
        String texto;

        while(n<=100){
            texto = "";
            if(n % 3 == 0) texto += "Fizz";
            if(n % 5 == 0) texto += "Buzz";
            System.out.println(n + texto);
            n++;
        }
    }
}
