import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dados2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner arquivo = new Scanner(new File("Prog004/src/dados2.txt"));

        String nome;
        int idade;
        char sexo;

        float soma = 0;
        int cont = 0;

        // calcular a média das idades

        while(arquivo.hasNext()){ // .hasNext() quer dizer "temPróximaLinha"
            nome = arquivo.next(); // next() lês só uma palavra
            idade = arquivo.nextInt();
            sexo = arquivo.next().charAt(0);
            System.out.printf("%-6s\t%d\t%c\n", nome, idade, sexo);

            soma = soma + idade;
            cont = cont + 1;
        }

        if(cont > 0) {
            float media = soma / cont;
            System.out.printf("Média de idades: %.1f\n", media);
        } else {
            System.out.println("Não tem ninguém aqui pra calcular a média");
        }

        arquivo.close(); // fechar a leitura do arquivo
    }
}
