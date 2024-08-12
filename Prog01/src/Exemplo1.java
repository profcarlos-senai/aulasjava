public class Exemplo1 {
    public static void main(String[] args) {
        int idade = 13;
        double peso = 45.123;
        String nome = "Juquinha";

        // imprime com printf
        System.out.printf("Meu nome é %-30s, peso %.1fkg e tenho %d anos.\n", nome, peso, idade);

        // formata uma string igualzinho ao printf e imprime
        String saida = String.format("Meu nome é %-30s, peso %.1fkg e tenho %d anos.\n", nome, peso, idade);
        System.out.print(saida);
    }
}
