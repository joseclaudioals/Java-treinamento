package lista_6.questao3;

public class Serie extends Conteudo{
    private int temporadas;
    private int episodiostPorTemporada;

    Serie(int temporadas, int episodiostPorTemporada, String titulo, int ano, String genero){
        super(titulo, ano, genero);
        if(temporadas>0 && episodiostPorTemporada>0){
            this.temporadas=temporadas;
            this.episodiostPorTemporada=episodiostPorTemporada;
        }
        else
            throw new IllegalArgumentException();
    }

    @Override
    int calcularTempo(){
        return episodiostPorTemporada * 45 * temporadas;
    }
}
