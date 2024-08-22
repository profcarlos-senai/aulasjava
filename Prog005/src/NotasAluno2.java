public class NotasAluno2 {
    private float[] notas;
    private float exame;

    /**
     * Cria um objeto NotasAluno2
     * @param n o número de notas que esse aluno tem
     */
    public NotasAluno2(int n) {
        notas = new float[n]; // inicializa o vetor com N floats
    }

    /**
     * Grava uma nota dentro do objeto
     * @param n é o número da nota (começando em 0)
     * @param nota a nota que tem nessa posição
     */
    public void setNota(int n, float nota){
        notas[n] = nota;
    }

    /**
     * Pega a nota que está na posição n
     * @param n posição da nota
     * @return o valor da nota
     */
    public float getNota(int n){
        return notas[n];
    }

    /**
     * Calcula a média
     * @return a média aritmética das notas
     */
    public float media(){
        int tamanho = notas.length;
        float soma = 0;
        for(int i=0; i<tamanho; i++){
            soma += notas[i]; // soma todas as notas
        }
        return soma/tamanho; // retorna o calculo da media
    }

    /**
     * Diz se tá em exame
     * @return true se a média for menor que 7
     */
    public boolean emExame(){ //
        return (media() < 7);
    }

    /**
     * Calcula a média final baseado na nota do exame
     * @param nota a nota do exame
     * @return (nota+media)/2
     */
    public float mediaFinal(float nota){
        this.exame = nota;
        return (media() + exame)/2;
    }

    public float getExame() {
        return exame;
    }

    public float[] getNotas() {
        return notas.clone(); // devolve um clone pra não permitir que mexa nas notas por fora do objeto
    }
}
