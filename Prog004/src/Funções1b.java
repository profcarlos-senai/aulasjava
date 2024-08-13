import java.util.Scanner;

public class Funções1b {

    public static void main(String[] args) { // void = nulo, nada, vazio
        // pergunta o nome do cabra
        String cabra = perguntaNomeDoCabra(); // pergunta_nome_do_cabra()
        // diga olá pro cabra
        digaOláProCabra(cabra);
        digaOláProCabra("Mariana");
    }

    static void digaOláProCabra(String nome) {
        System.out.println("Olá, "+nome);
    }

    static String perguntaNomeDoCabra() {
        Scanner leitora = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        return leitora.nextLine(); // return joga o valor de volta pra quem chamou
        // return faz "perguntaNomeDoCabra" valer "Juca"
    }

}
