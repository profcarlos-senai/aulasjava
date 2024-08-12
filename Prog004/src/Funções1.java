public class Funções1 {

    public static void main(String[] args) {
        digaOlá();
        int um = 1;
        int dois = 2;
        int resultado = soma(um, dois);
        System.out.println("Resultado = "+resultado);
        System.out.println("Um mais um = "+soma(1,1));
        digaOlá();
        System.out.println(soma(4,5));
    }

    static void digaOlá(){
        System.out.println("Olá, mundo!");
    }

    static int soma(int num1, int num2){
        return num1 + num2;
    }
}
