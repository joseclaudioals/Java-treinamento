public abstract class Pagamento implements Processavel {
    private String id;
    private double valor;
    private boolean pago;

    protected Pagamento(String id, double valor) throws PagamentoInvalidoException{
        setId(id);
        setValor(valor);
        this.pago = false;
    }

    // == setters ==

    private void setId(String id)throws PagamentoInvalidoException{
        if(id==null || id.isBlank())
            throw new PagamentoInvalidoException("O id nao pode ser nulo nem vazio");

        this.id=id;
    }

    private void setValor(double valor)throws PagamentoInvalidoException{
        if(valor<Processavel.VALOR_MINIMO_PROCESSAMENTO)
            throw new PagamentoInvalidoException("O valor deve ser acima do valor minimo permitido");

        this.valor=valor;
    }

    // == getters ==
    
    protected double getValor(){
        return this.valor;
    }

    protected String getId(){
        return this.id;
    }

    protected boolean isPago(){
        return this.pago;
    }

    // == metodo concreto de processamento 

    public final void processarPagamento()throws FalhaProcessamentoException, PagamentoInvalidoException {
        validarDados(); 
        if(this.valor<Processavel.VALOR_MINIMO_PROCESSAMENTO){
            throw new FalhaProcessamentoException("valor minimo nao atingido para pagamento");
        }
        if (this.pago) {
           throw new FalhaProcessamentoException("Pagamento ja realizado");
       }
       
       this.pago = true;

       double taxa = calcularTaxa();
       this.valor+=taxa;
    }

    // == metodos abstratos == 

    public abstract double calcularTaxa();

    public abstract void validarDados() throws PagamentoInvalidoException;
}
