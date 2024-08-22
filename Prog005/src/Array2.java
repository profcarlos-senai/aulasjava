/**
 * Jeitos de criar arrays em Java
 */
public class Array2 {
    public static void main(String[] args) {
        // um jeito de criar arrays é declarar e já encher com valores
        int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};
        // outro jeito é declarar num lugar e iniciar no outro
        String[] mes;
        mes = new String[12]; // cria um vetor de 12 strings em "mes"
        mes[0] = "Janeiro";
        mes[1] = "Fevereiro";
        mes[2] = "Março";
        mes[3] = "Abril";
        mes[4] = "Maio";
        mes[5] = "Junho";
        mes[6] = "Julho";
        mes[7] = "Agosto";
        mes[8] = "Setembro";
        mes[9] = "Outubro";
        mes[10] = "Novembro";
        mes[11] = "Dezembro";

        // pra vasculhar um vetor
        for(int i=0; i<12; i++){
            System.out.printf("O mês de %s tem %d dias.\n", mes[i], diasMes[i]);
        }
    }
}
