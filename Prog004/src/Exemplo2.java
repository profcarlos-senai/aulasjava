public class Exemplo2 {
    static int x;
    static int y;

    static int z(){
        return x + y;
    }

    public static void main(String[] args) {
        x = 1;
        y = 2;
        System.out.println("x="+x+" y="+y+" z="+z());
        x = 8;
        System.out.println("x="+x+" y="+y+" z="+z());
    }
}
