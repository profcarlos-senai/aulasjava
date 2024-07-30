import java.util.Scanner;

/*
  Perguntar idade e genero e responder algumas perguntas
*/
public class Decisao7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // variaveis
        int idade;
        String genero;

        // digita um número
        System.out.print("Idade e genero: ");
        idade = teclado.nextInt();
        genero = teclado.next();
        System.out.println();

        // testa se é adulto (ou seja, nem menor de idade nem idoso)
        if( (idade >= 18) && (idade < 65) ){ // o símbolo "&&" quer dizer "E"
            System.out.println("Adulto");
        }

        if( idade < 18 || idade >= 65 ){ // o símbolo "||" quer dizer "ou"
            System.out.println("Paga meia");
        }

        if(idade >= 18){
            if(idade < 65){
                System.out.println("Adulto de novo");
            }
        }

        // equalsIgnoreCase significa "igualIgnoraMaiusculas/Minusculas
        if(genero.equalsIgnoreCase("F") || (idade < 14)){ // OU
            System.out.println("Mulheres e crianças");
        }

        if( !genero.equalsIgnoreCase("M") ) { // "!" é "não" (inverte o valor lógico da condição)
            System.out.println("Proibido meninos");
        }

        if( !genero.equalsIgnoreCase("F") && !genero.equalsIgnoreCase("M")){
            System.out.println("Genero não identificado");
        }
    }
}
