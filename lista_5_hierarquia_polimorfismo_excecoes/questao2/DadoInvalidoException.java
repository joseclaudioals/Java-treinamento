package lista_5_hierarquia_polimorfismo_excecoes.questao2;

public class DadoInvalidoException extends Exception{
    public DadoInvalidoException(){
        super("Erro: dado invalido para tal atributo");
    }

    public DadoInvalidoException(String message){
        super(message);
    }
}
