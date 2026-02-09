package lista_5_hierarquia_polimorfismo_excecoes.questao7;

public class PrazoExpiradoException extends Exception {
    public PrazoExpiradoException(String message){
        super(message);
    }

    public PrazoExpiradoException(){
        super("Dado invalido: impossivel criar tarefa");
    }
    
}
