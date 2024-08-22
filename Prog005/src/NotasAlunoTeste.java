public class NotasAlunoTeste {
    public static void main(String[] args) {

        NotasAluno juquinha = new NotasAluno(6,6,4,8);
        System.out.println("Média do Juquinha: "+juquinha.media() );
        System.out.printf("Notas do Juquinha: %.1f %.1f %.1f %.1f\n",
                juquinha.nota1, juquinha.nota2, juquinha.nota3, juquinha.nota4);
        if( juquinha.emExame() ){
            System.out.println("Juquinha pegou exame");
            // vamos assumir que ele tirou 10 no exame
            float notaExame = 10;
            System.out.println("Media final do Juquinha: "+juquinha.mediaFinal(notaExame));
        }

        NotasAluno mariazinha = new NotasAluno(9,10,9,10);
        System.out.println("Média da Mariazinha "+mariazinha.media() );
    }
}
