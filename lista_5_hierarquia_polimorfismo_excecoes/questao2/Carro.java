package lista_5_hierarquia_polimorfismo_excecoes.questao2;

public class Carro extends Veiculo {
    public Carro(String modelo, double precoBase)throws DadoInvalidoException{
        super(modelo, precoBase);
    }
    
    @Override
    public double calcularImposto(){
        return super.getPrecoBase() * 0.05; // o carro possui 5% de imposto sobre seu preço base
    }
}
