package lista_5_hierarquia_polimorfismo_excecoes.questao5;

public class OperacaoInvalidaException extends Exception{ 
    public OperacaoInvalidaException(String message){
        super(message);
    }
}
