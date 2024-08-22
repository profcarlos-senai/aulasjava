public class NotasAluno {
    float nota1, nota2, nota3, nota4, exame;

    // Construtor dos objetos da classe
    public NotasAluno(float nota1, float nota2, float nota3, float nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public float media(){
        return (nota1+nota2+nota3+nota4)/4; // retorna o calculo da media
    }

    public boolean emExame(){ // retorna true se a média for menor que 7
        return (media() < 7);
    }

    // passa a nota do exame e pega a média final
    // tecnicamente isso aqui é muito feio pq uma função não deveria ter dois efeitos
    public float mediaFinal(float nota){
        this.exame = nota;
        return (media() + exame)/2;
    }
}
