public class Repetição10 {
    public static void main(String[] args) {
        // faça um programa que pergunte um nome e imprima um triângulo assim:
        // MARIETA
        // ARIETA
        // RIETA
        // IETA
        // ETA
        // TA
        // A

        String nome = "BATATA";
        int tamanho, x, y;

        tamanho = nome.length();

        int i=0;
        while(i<tamanho){
            System.out.println(nome);
            i++;
        }

        for(i=0; i<tamanho; i++){
            System.out.println(nome);
        }
    }
}
