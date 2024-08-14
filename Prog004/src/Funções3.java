public class Funções3 {
    // faça uma função void doguinho() que quando chamada imprima "au au"
    private static void doguinho() {
        System.out.println("au au!");
    }

    // depois crie outra void dogão(int n) que você passe um número pra ela e ela faça n "AU"
    private static void dogão(int n){
        if(n<=0){ // testa se n é válido
            return;
        }

        int au = 1;
        while(au <= n){
            System.out.print("AU");
            au++;
        }
        System.out.println();
    }

    // agora crie um void pinscher(n) que o latido é assim AUauAUauAUauAU
    static void pinscher(int n){
        int i = 1;
        while(i <= n){
            // aqui uma vez faz AU outra faz au
            if(i%2 == 0){
                System.out.print("AU");
            } else {
                System.out.print("au");
            }
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        doguinho(); // faz au au
        doguinho(); // faz au au de novo
        dogão(3); // faz AU AU AU
        dogão(5); // faz AU AU AU AU AU
        pinscher(21);
    }
}
