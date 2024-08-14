import java.util.Scanner;

public class ExemploFunções2 {
    public static void main(String[] args) {
        Scanner leitora = new Scanner(System.in);
        Pessoa fulano = new Pessoa();
        fulano.nome = "Juca";
        fulano.idade = 17;
        fulano.sexo = 'M';

        System.out.printf("Preço do ingresso: R$ %.2f", fulano.preçoIngresso(50));
    }
}
