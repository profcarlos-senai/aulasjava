public class Repetição4 {
    public static void main(String[] args) {
        // imprimir os numeros de 1 a 10 em ordem crescente
        // ao final imprimir a soma desses números

        int numero = 1;
        int soma = 0;
        // repetir até chegar em 10
        while(numero <= 10) {
            soma = soma + numero; // faz a soma (acumulador)
            System.out.println(numero); // imprime o numero
            numero = numero + 1; // aumenta o numero (contador)
        }
        System.out.println("Soma: "+soma);
    }
}
