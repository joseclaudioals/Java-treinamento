package lista_5_hierarquia_polimorfismo_excecoes.questao2;

public class Moto extends Veiculo{

    public Moto(String modelo, double precoBase)throws DadoInvalidoException{
        super(modelo, precoBase);
    }

    @Override
    public double calcularImposto(){
        return super.getPrecoBase() * 0.03; //moto tem 3% de imposto sobre o preco base
    }
    
}
