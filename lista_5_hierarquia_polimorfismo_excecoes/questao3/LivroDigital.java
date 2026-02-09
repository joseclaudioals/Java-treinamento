package lista_5_hierarquia_polimorfismo_excecoes.questao3;

public class LivroDigital extends ItemDigital {
    private String autor;

    protected LivroDigital(String titulo, String autor, double tamanhoMB)throws ItemInvalidoException{
        super(titulo, tamanhoMB);
        if(autor == null || autor.isBlank())
            throw new ItemInvalidoException("Nome do autor nao pode ser null ou vazio");

        this.autor=autor;
    }

    @Override
    public String getDescricao(){
        return "Livro: " + super.getTitulo() + " - " + this.autor + " | tamanho: " + super.getTamanhoMB() + "MB";
    }
}
