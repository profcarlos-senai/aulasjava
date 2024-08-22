public class Agenda {
    private final int[] DIAS_MES = {31,29,31,30,31,30,31,31,30,31,30,31}; // nº de dias de cada mes
    private final String[] NOME_MES = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
            "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
    private String[][][] agenda; // contém 24 strings por dia para cada dia de cada mes do ano

    public Agenda() { // construtor da agenda
        // cria 12 vetores de int vazios
        agenda = new String[12][][];

        // agora fazo vetor de cada mes no tamanho certo
        for (int i = 0; i < 12; i++) {
            agenda[i] = new String[ DIAS_MES[i] ][24]; // cria uma matriz de tamanho diasMes[i][24]
        }
    }

    public void setCompromisso(int hora, int dia, int mes, String compromisso){
        agenda[mes-1][dia-1][hora-1] = compromisso;
    }

    public String getCompromisso( int hora, int dia, int mes){
        return agenda[mes-1][dia-1][hora-1];
    }

    public String[] getDia(int mes, int dia){
        return agenda[mes-1][dia-1]; // retorna um vetor de 24 strings
    }

    public String[][] getMes(int mes){
        return agenda[mes-1]; // retorna um vetor de 28 a 31 dias x 24h
    }

    public void imprimeAno(){ // imprime a agenda do ano inteiro
        for (int mes = 0; mes < agenda.length; mes++) { // todos os meses
            for (int dia = 0; dia < agenda[mes].length; dia++) { // todos os dias de cada mês
                for (int hora = 0; hora < agenda[mes][dia].length; hora++) {
                    if(agenda[mes][dia][hora] != null){ // se esse horário foi agendado
                        System.out.printf("%2d/%s %2d:00 - %s\n", dia, NOME_MES[mes], hora, agenda[mes][dia][hora]);
                    }
                }
            }

        }
    }
}
