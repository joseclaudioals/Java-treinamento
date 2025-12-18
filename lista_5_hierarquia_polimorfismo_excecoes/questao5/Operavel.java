package lista_5_hierarquia_polimorfismo_excecoes.questao5;

public interface Operavel {
    void depositar(double valor) throws OperacaoInvalidaException;
    void sacar(double valor) throws OperacaoInvalidaException;
    double getSaldo();
}
