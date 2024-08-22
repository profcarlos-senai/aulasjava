import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dados4 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner arquivo = new Scanner(new File("Prog004/src/dados3.txt"));

        String nome;
        int idade;
        char sexo;

        // imprimir a idade da pessoa mais velha
        // quando conseguir isso, agora imprima também o nome do mais velho
        // quando conseguir isso, faça o mesmo para o mais novo
        int maior=0;
        int menor=999;
        // agora ache o mais novo e o nome dessa pessoa
        // além de imprimir o mais velho, imprima o segundo mais velho

        while(arquivo.hasNext()){ // .hasNext() quer dizer "temPróximaLinha"
            nome = arquivo.next(); // next() lês só uma palavra
            idade = arquivo.nextInt();
            sexo = arquivo.next().charAt(0);
            System.out.printf("%-6s\t%d\t%s\n", nome, idade, (sexo=='F') ? "fem":"masc" );


            maior = Math.max(maior, idade);
            menor = Math.min(menor, idade);

        }

        arquivo.close(); // fechar a leitura do arquivo

        System.out.printf("O mais velho tem %d e o mais novo tem %d anos\n", maior, menor);
    }
}
