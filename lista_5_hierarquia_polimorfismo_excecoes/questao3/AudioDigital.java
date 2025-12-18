package lista_5_hierarquia_polimorfismo_excecoes.questao3;

public class AudioDigital extends ItemDigital{
    private int qualidadeKbps;

    protected AudioDigital(String titulo, double tamanhoMB, int qualidadeKbps) throws ItemInvalidoException{
        super(titulo, tamanhoMB);

        if(qualidadeKbps<=64)
            throw new ItemInvalidoException("a qualidade do audio deve ser superior a 64bps");

        this.qualidadeKbps=qualidadeKbps;
    }

    @Override
    public String getDescricao(){
        return "Audio: " + super.getTitulo() + " - " + this.qualidadeKbps + " | tamanho: " + super.getTamanhoMB() + "MB";
    }
}
