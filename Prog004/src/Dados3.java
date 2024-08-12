import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dados3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner arquivo = new Scanner(new File("Prog004/src/dados2.txt"));

        String nome;
        int idade;
        char sexo;

        float soma=0,somaM=0, somaF=0;
        int cont=0,contM=0, contF=0;

        // calcular a média das idades dos homens e das mulheres

        while(arquivo.hasNext()){ // .hasNext() quer dizer "temPróximaLinha"
            nome = arquivo.next(); // next() lês só uma palavra
            idade = arquivo.nextInt();
            sexo = arquivo.next().charAt(0);
            System.out.printf("%-6s\t%d\t%c\n", nome, idade, sexo);

            // media geral
            soma += idade;
            cont++;

            // média dos home
            if(sexo == 'M'){
                somaM += idade;
                contM++;
            }

            // média das muié
            if(sexo == 'F'){
                somaF = somaF + idade;
                contF = contF + 1;
            }
        }

        if(cont > 0) {
            float media = soma / cont;
            System.out.printf("Média de idades: %.1f\n", media);
        } else {
            System.out.println("Não tem ninguém aqui pra calcular a média");
        }

        if(contM > 0){
            System.out.printf("Média dos homens: %f\n", somaM/contM);
        }

        if(contF > 0){
            System.out.printf("Média das mulheres: %f\n", somaF/contF);
        }

        arquivo.close(); // fechar a leitura do arquivo
    }
}
