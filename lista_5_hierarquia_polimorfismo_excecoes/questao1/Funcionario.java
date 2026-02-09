package lista_5_hierarquia_polimorfismo_excecoes.questao1;

public abstract class Funcionario {
    private String nome;
    private String documento;

    protected Funcionario(String nome, String documento) throws DadoInvalidoException{
        setNome(nome);
        setDocumento(documento);
    }

    // == setters ==

    protected void setNome(String nome)throws DadoInvalidoException{
        if(nome==null)
            throw new DadoInvalidoException();

        if(nome.isBlank())
            throw new DadoInvalidoException();

        this.nome=nome;
    }
    protected void setDocumento(String documento)throws DadoInvalidoException{
        if(documento==null)
            throw new DadoInvalidoException();
        if(documento.isBlank())
            throw new DadoInvalidoException();

        this.documento=documento;
    }
    
    // metodos gerais 
    public final String getNome(){
        return this.nome;
    }
    public final String getDocumento(){
        return this.documento;
    }
    public abstract double calcularPagamento();
}

class DadoInvalidoException extends Exception{
    public DadoInvalidoException(){
        super("O dado inserido nao é valido para tal atributo");
    }
    
    public DadoInvalidoException(String message){
        super(message);
    }
}

class FuncionarioAssalariado extends Funcionario {
    private double salarioMensal;

    public FuncionarioAssalariado(String nome, String documento, double salario) throws DadoInvalidoException{
        super(nome, documento);
        setSalarioMensal(salario);
    }

    private void setSalarioMensal(double salario)throws DadoInvalidoException{
        if(salario<=0)
            throw new DadoInvalidoException("o valor do salario deve ser maior que zero");

        this.salarioMensal=salario;
    }

    @Override
    public double calcularPagamento(){
        return this.salarioMensal;
    }
    
}

class FuncionarioHorista extends Funcionario{
    private double valorHora;
    private int horasTrabalhadas;

    public FuncionarioHorista(String nome, String documento, double valorHora, int horasTrabalhadas) throws DadoInvalidoException{
        super(nome, documento);
        setHorasTrabalhadas(horasTrabalhadas);
        setValorHora(valorHora);
    }

    // == setters ==
    
    private void setHorasTrabalhadas(int horasTrabalhadas)throws DadoInvalidoException{
        if(horasTrabalhadas<0)
            throw new DadoInvalidoException();

        this.horasTrabalhadas=horasTrabalhadas;
    }

    private void setValorHora(double valorHora)throws DadoInvalidoException{
        if(valorHora<=0)
            throw new DadoInvalidoException();

        this.valorHora=valorHora;
    }

    // == metodos de Funcionario horista 

    @Override
    public double calcularPagamento(){
        return (double)this.horasTrabalhadas*this.valorHora;
    }
}

class FuncionarioComissionado extends Funcionario{
    private double vendasBrutas;
    private double percentualPagamento;

    public FuncionarioComissionado(String nome, String documento, double vendasBrutas, double percentualPagamento) throws DadoInvalidoException{
        super(nome, documento);
        setVendasBrutas(vendasBrutas);
        setPercentualPagamento(percentualPagamento);
    }

    // == setters ==

    private void setVendasBrutas(Double vendasBrutas)throws DadoInvalidoException{
        if(vendasBrutas<0)
            throw new DadoInvalidoException();

        this.vendasBrutas=vendasBrutas;
    }

    private void setPercentualPagamento(double percentualPagamento)throws DadoInvalidoException{
        if(percentualPagamento>1 || percentualPagamento<0)
            throw new DadoInvalidoException("o percentual deve estar entre 0 e 1");

        this.percentualPagamento=percentualPagamento;
    }

    @Override
    public double calcularPagamento(){
        return vendasBrutas*percentualPagamento;
    }
}

