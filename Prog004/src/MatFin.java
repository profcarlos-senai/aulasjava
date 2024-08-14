/*------------------------------------
MATFIN.JAVA
Funções de matemática financeira
autor: carlos.correia@docente.senai.br
------------------------------------*/
public class MatFin {
    public static double calcPercentual(double parte, double todo){
        return parte/todo*100;
    }

    public static double aplicaPercentual(double valor, double percentagem){
        return valor * (percentagem/100);
    }

    public static double juroComposto(double valor, double taxa, int periodos){
        return 0;
    }
}
