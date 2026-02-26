package lista_6.questao3;

public abstract class Conteudo {
    private String titulo;
    private int ano;
    private String genero;
    private boolean assistido;

    Conteudo(String titulo, int ano, String genero)throws IllegalArgumentException{
        if(ano>1500 && ano<2026 && titulo!= null || !titulo.isEmpty() && genero!=null && !genero.isEmpty()){
            this.titulo = titulo;
            this.ano = ano;
            this.genero = genero;
        }
        else
            throw new IllegalArgumentException();
    }

    abstract int calcularTempo();

    String getTitulo(){
        return titulo;
    }

    String getGenero(){
        return genero;
    }

    int getAno(){
        return ano;
    }

    boolean isAssistido(){
        return assistido;
    }
}
