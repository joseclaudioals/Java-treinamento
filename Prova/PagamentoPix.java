public class PagamentoPix extends Pagamento{
    private String chavePix;

    protected PagamentoPix(String id, double valor, String chavePix) throws PagamentoInvalidoException{
        super(id, valor);
        setChavePix(chavePix);
    }

    private void setChavePix(String chavePix) throws PagamentoInvalidoException{
        if(chavePix==null || chavePix.isBlank() || !chavePix.matches("^[^@]+@[^@]+\\.[^@]+$"))
            throw new PagamentoInvalidoException("Chave pix invalida ");

        this.chavePix=chavePix;
    }

    @Override
    public double calcularTaxa() {
        return 0;
    }

    @Override
    public void validarDados() throws PagamentoInvalidoException{
       if(chavePix==null || chavePix.isBlank() || !chavePix.matches("^[~@]+@[^@]+\\.[^@]+$"))
            throw new PagamentoInvalidoException("Chave pix invalida ");
    }


    
}
