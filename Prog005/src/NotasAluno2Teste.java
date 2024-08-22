public class NotasAluno2Teste {
    public static void main(String[] args) {

        NotasAluno2 juquinha = new NotasAluno2(4);
        juquinha.setNota(0, 6);;
        juquinha.setNota(1, 6);;
        juquinha.setNota(2, 4);;
        juquinha.setNota(3, 8);;

        System.out.println("Média do Juquinha: "+juquinha.media() );
        System.out.printf("Notas do Juquinha: %.1f %.1f %.1f %.1f\n",
                juquinha.getNota(0), juquinha.getNota(1), juquinha.getNota(2), juquinha.getNota(3));
        if( juquinha.emExame() ){
            System.out.println("Juquinha pegou exame");
            // vamos assumir que ele tirou 10 no exame
            float notaExame = 10;
            System.out.println("Media final do Juquinha: "+juquinha.mediaFinal(notaExame));
        }

        NotasAluno2 mariazinha = new NotasAluno2(2);
        mariazinha.setNota(0, 9);
        mariazinha.setNota(1, 10);
        System.out.println("Média da Mariazinha "+mariazinha.media() );
    }
}
