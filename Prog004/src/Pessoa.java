public class Pessoa {
    String nome;
    int idade;
    char sexo;

    public boolean pagaMeia(){
        if(idade < 18){
            return true; // return cai fora da função devolvendo esse valor
        }
        if(idade >= 65){
            return true; // cai fora
        }
        return false; // se não caiu fora até agora...
    }

    public float preçoIngresso(float inteira){
        if(pagaMeia()){
            return inteira/2;
        } else {
            return inteira;
        }
    }
}
