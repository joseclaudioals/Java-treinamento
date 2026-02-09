package lista_5_hierarquia_polimorfismo_excecoes.questao5;

public class ContaCorrente extends Conta {
    private static final double taxaOperacao = 1.5;

    protected ContaCorrente(String numero, double saldo) throws OperacaoInvalidaException{
        super(numero);
    }

    @Override
    public void sacar(double saque)throws OperacaoInvalidaException{
        super.sacar(saque);

        try{
            super.sacar(ContaCorrente.taxaOperacao); // fazendo o desconto da taxa
        } catch(OperacaoInvalidaException e){
            super.depositar(saque);
            throw new OperacaoInvalidaException("Saldo insuficiente para a taxa");
        }
    }

    @Override
    public void depositar(double deposito)throws OperacaoInvalidaException{
        super.depositar(deposito);

        try{
            super.sacar(ContaCorrente.taxaOperacao); // fazendo o desconto da taxa
        } catch(OperacaoInvalidaException e){
            super.sacar(deposito);
            throw new OperacaoInvalidaException("Saldo insuficiente para a taxa");
        }
    }
}
