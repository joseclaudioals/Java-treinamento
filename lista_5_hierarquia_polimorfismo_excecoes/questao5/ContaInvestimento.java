package lista_5_hierarquia_polimorfismo_excecoes.questao5;

public class ContaInvestimento extends Conta{
    protected ContaInvestimento(String numero)throws OperacaoInvalidaException{
        super(numero);
    }

    @Override
    public void sacar(double saque)throws OperacaoInvalidaException{
        if(super.getSaldo()-saque<super.getSaldo()*0.1)
            throw new OperacaoInvalidaException("Impossivel realizar saque, valor na conta inferior a 10% do valor total");
        
        super.sacar(saque);
    }
    
}
