package lista_5_hierarquia_polimorfismo_excecoes.questao5;

public abstract class Conta implements Operavel {
    private String numero;
    private double saldo;
    protected Conta(String numero)throws OperacaoInvalidaException{
        if(numero==null||numero.isBlank())
            throw new OperacaoInvalidaException("Numero da conta invalido");

        this.numero=numero;
        this.saldo=0.0;
    }

    @Override
    public void depositar(double deposito)throws OperacaoInvalidaException{
        if(deposito<=0)
            throw new OperacaoInvalidaException("deposito deve ter um valor maior que zero");

        this.saldo+=deposito;
        System.out.println("deposito realizado com sucesso\n");
    }

    @Override
    public void sacar(double saque)throws OperacaoInvalidaException{
        if(saque<=0)
            throw new OperacaoInvalidaException("O saque deve ser maior que zero");

        if(saldo-saque<0)
            throw new OperacaoInvalidaException("Valor de saque maior que o saldo");

        saldo-=saque;
        System.out.println("saldo realizado com sucesso");
    }

    protected String getNumero(){
        return numero;
    }
    @Override
    public double getSaldo(){
        return saldo;
    }
    
}
