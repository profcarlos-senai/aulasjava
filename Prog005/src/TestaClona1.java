public class TestaClona1 {
    /**
     * Recebe um vetor de ints e imprime
     * @param vetor o vetor pra imprimir
     */
    public static void imprimeVetor(int[] vetor){
        System.out.print("[");
        for(int i=0; i< vetor.length; i++){
            System.out.print(vetor[i]);
            if(i < vetor.length-1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int coisa[] = {1, 2, 3, 4};
        imprimeVetor(coisa);
        int outraCoisa[] = coisa;
        imprimeVetor(outraCoisa);
        outraCoisa[2] = 99;
        imprimeVetor(outraCoisa);
        imprimeVetor(coisa);
        outraCoisa = coisa.clone();
        outraCoisa[1] = 1000;
        imprimeVetor(outraCoisa);
        imprimeVetor(coisa);


    }
}
