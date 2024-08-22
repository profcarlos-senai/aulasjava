public class Array3 {
    public static void main(String[] args) {
        // criar um vetor de int para guardar as horas trabalhadas em cada dia da semana
        // crie o vetor já com valores dentro usando { ... }
        int horas[] = {8,8,8,8,8,0,0};

        // depois se quiser crie o vetor dos nomes dos dias da semana também usando { ... }
        String dias[] = {"segunda", "terça", "quarta", "quinta", "sexta", "sábado", "domingo"};

        // daí imprimir quanto trabalhou e cada dia e mostrar o total
        int total = 0;
        for (int i = 0; i < dias.length; i++) {
            System.out.printf("%s trabalhei %d horas\n", dias[i], horas[i]);
            total = total + horas[i]; // soma o total
        }
        System.out.printf("Total: %d\n", total);
    }
}
