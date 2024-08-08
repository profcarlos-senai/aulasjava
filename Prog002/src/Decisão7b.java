import java.util.Scanner;

/*
  Perguntar idade e genero e responder algumas perguntas
*/
public class Decisão7b {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // variaveis
        int idade;
        char genero; // variáveis do tipo "char" guardam uma única letra

        // digita um número
        System.out.print("Idade e genero: ");
        idade = teclado.nextInt();
        genero = teclado.next().charAt(0);

        boolean adulto = (idade >= 18);
        boolean idoso = (idade >= 65);
        boolean mulher = (genero == 'F' || genero == 'f');
        boolean homem = (genero == 'M' || genero == 'm');
        boolean criança = (idade < 14);

        System.out.println();

        // testa se é adulto (ou seja, nem menor de idade nem idoso)
        if( adulto && !idoso ){ // o símbolo "&&" quer dizer "E"
            System.out.println("Adulto");
        }

        if( !adulto || idoso ){ // o símbolo "||" quer dizer "ou"
            System.out.println("Paga meia");
        }

        if(adulto){
            if(!idoso){
                System.out.println("Adulto de novo");
            }
        }

        // equalsIgnoreCase significa "igualIgnoraMaiusculas/Minusculas
        if( mulher || criança){ // OU
            System.out.println("Mulheres e crianças");
        }

        if( !homem ) { // "!" é "não" (inverte o valor lógico da condição)
            System.out.println("Proibido meninos");
        }

        if(!homem && !mulher){
            System.out.println("Não-binário");
        }
    }
}
