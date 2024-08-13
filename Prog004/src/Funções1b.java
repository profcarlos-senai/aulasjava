public class Funções1b {

    public static void main(String[] args) { // void = nulo, nada, vazio
        // pergunta o nome do cabra
        String cabra = perguntaNome();
        // diga olá pro cabra
        digaOláProCabra(cabra);
    }

    private static void digaOláProCabra(String cabra) {
        System.out.println("Olá, "+cabra);
    }

    private static String perguntaNome() {
    }

}
