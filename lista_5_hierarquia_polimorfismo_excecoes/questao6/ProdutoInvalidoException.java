package lista_5_hierarquia_polimorfismo_excecoes.questao6;

public class ProdutoInvalidoException extends Exception {
    public ProdutoInvalidoException(String message){
        super(message);
    }
}
