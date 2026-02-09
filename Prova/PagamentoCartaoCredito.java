public class PagamentoCartaoCredito extends Pagamento{
    private String numeroCartao;
    private double percentualTaxa;

    protected PagamentoCartaoCredito(String id, double valor, String numeroCartao, double percentualTaxa) throws PagamentoInvalidoException{
        super(id, valor);
        validarParametros(numeroCartao, percentualTaxa);
    }

    private void validarParametros(String numeroCartao, double percentualTaxa) throws PagamentoInvalidoException {
        if(numeroCartao == null || numeroCartao.isBlank() || numeroCartao.length() != 16 || !numeroCartao.matches("\\d+"))
            throw new PagamentoInvalidoException("o numero do cartao eh invalido");

        if(percentualTaxa<0 || percentualTaxa>0.2)
            throw new PagamentoInvalidoException("o percentual do cartão eh invalido");

        this.numeroCartao=numeroCartao;
        this.percentualTaxa=percentualTaxa;
    }

    @Override
    public double calcularTaxa() {
        return super.getValor() * this.percentualTaxa;
    }

    @Override
    public void validarDados() throws PagamentoInvalidoException {
        if(numeroCartao == null || numeroCartao.isBlank() || numeroCartao.length() != 16 || !numeroCartao.matches("\\d+"))
            throw new PagamentoInvalidoException("o numero do cartao eh invalido");

        if(percentualTaxa<0 || percentualTaxa>0.2)
            throw new PagamentoInvalidoException("o percentual do cartão eh invalido");


    }
}
