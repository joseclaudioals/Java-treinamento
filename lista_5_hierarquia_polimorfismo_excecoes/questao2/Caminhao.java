package lista_5_hierarquia_polimorfismo_excecoes.questao2;

public class Caminhao extends Veiculo {

    public Caminhao(String modelo, double precoBase)throws DadoInvalidoException{
        super(modelo, precoBase);
}

    @Override
    public double calcularImposto(){
        if(super.getPrecoBase()>200000)
            return super.getPrecoBase() * 0.1; // se o carro custar mais que 200.000 o imposto sobre o valor base é de 10%
        return super.getPrecoBase() * 0.08; // se nao, o imposto é de 8%
    }
}
