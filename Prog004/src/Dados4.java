import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dados4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner arquivo = new Scanner(new File("Prog004/src/dados2.txt"));

        String nome;
        int idade;
        char sexo;

        // imprimir a idade da pessoa mais velha
        // quando conseguir isso, agora imprima também o nome do mais velho
        // quando conseguir isso, faça o mesmo para o mais novo
        int maior=0, segundo=0, menor=9999;
        String nomeMaior="", nomeSegundo="", nomeMenor="";
        // agora ache o mais novo e o nome dessa pessoa
        // além de imprimir o mais velho, imprima o segundo mais velho

        while(arquivo.hasNext()){ // .hasNext() quer dizer "temPróximaLinha"
            nome = arquivo.next(); // next() lês só uma palavra
            idade = arquivo.nextInt();
            sexo = arquivo.next().charAt(0);
            System.out.printf("%-6s\t%d\t%c\n", nome, idade, sexo);

            if(idade > maior){
                segundo = maior; // salva o maior antes que mude
                nomeSegundo = nomeMaior;

                maior = idade;
                nomeMaior = nome;
            } else {
                if(idade > segundo){
                    segundo = idade;
                    nomeSegundo = nome;
                }
            }

            if(idade < menor){
                menor = idade;
                nomeMenor = nome;
            }

        }

        arquivo.close(); // fechar a leitura do arquivo

        System.out.printf("O mais velho tem %d anos e se chama %s\n", maior, nomeMaior);
        System.out.printf("O segundo mais velho tem %d anos e se chama %s\n", segundo, nomeSegundo);
        System.out.printf("O mais novo tem %d anos e se chama %s\n", menor, nomeMenor);
    }
}
