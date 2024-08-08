import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dados1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner arquivo = new Scanner(new File("Prog004/src/dados1.txt"));

        while(arquivo.hasNext()){ // .hasNext() quer dizer "temPróximaLinha"
            String nome = arquivo.nextLine(); // lê uma linha do arquivo
            System.out.println(nome);
        }

        arquivo.close(); // fechar a leitura do arquivo
    }
}
