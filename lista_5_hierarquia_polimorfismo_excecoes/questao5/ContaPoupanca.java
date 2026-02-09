package lista_5_hierarquia_polimorfismo_excecoes.questao5;

public class ContaPoupanca extends Conta{
    protected ContaPoupanca(String numero)throws OperacaoInvalidaException{
        super(numero);
    }

}
