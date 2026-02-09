package lista_5_hierarquia_polimorfismo_excecoes.questao3;

public abstract class ItemDigital {
    private String titulo;
    private double tamanhoMB;

    protected ItemDigital(String titulo, double tamanhoMB)throws ItemInvalidoException{
        if(titulo==null || titulo.isBlank())
            throw new ItemInvalidoException("Dado nao valido para atributo");

        if(tamanhoMB<=0)
                throw new ItemInvalidoException("Dado nao valido para atributo");

        this.titulo = titulo;
        this.tamanhoMB = tamanhoMB;
    }

    // == getters ==

    protected String getTitulo(){
        return this.titulo;
    }
    protected double getTamanhoMB(){
        return this.tamanhoMB;
    }

    // -----

    public abstract String getDescricao();
}
