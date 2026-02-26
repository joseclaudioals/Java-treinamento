package lista_6.questao3;

public class Filme extends Conteudo{
    private int duracaoEmMinutos;

    Filme(String titulo, String genero, int ano, int duracaoEmMinutos){
        super(titulo, ano, genero);
        if(ano>0){
            this.duracaoEmMinutos=duracaoEmMinutos;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    int calcularTempo() {
        return duracaoEmMinutos;
    }
}
