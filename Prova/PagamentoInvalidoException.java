
public class PagamentoInvalidoException extends RuntimeException{
    public PagamentoInvalidoException(){
        super("Um dos atributos de pagamento eh invalido");
    }

    public PagamentoInvalidoException(String message){
        super(message);
    }
}
