package lista_5_hierarquia_polimorfismo_excecoes.questao2;

public abstract class Veiculo implements Tributavel {
    private String modelo;
    private double precoBase;

    protected Veiculo(String modelo, double precoBase)throws DadoInvalidoException{
        setModelo(modelo);
        setPrecoBase(precoBase);
    }

    // setters 

    protected void setModelo(String modelo)throws DadoInvalidoException{
        if(modelo==null||modelo.isBlank()){
            throw new DadoInvalidoException();
        }

        this.modelo=modelo;
    }

    protected void setPrecoBase(double precoBase)throws DadoInvalidoException{
        if(precoBase<=0)
            throw new DadoInvalidoException();

        this.precoBase=precoBase;
    }

    // getters

    protected String getModelo(){
        return this.modelo;
    }

    protected double getPrecoBase(){
        return this.precoBase;
    }

    public abstract double calcularImposto();
}
