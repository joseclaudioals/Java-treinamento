package lista_5_hierarquia_polimorfismo_excecoes.questao3;

public class VideoDigital extends ItemDigital {
    private int duracaoMin;

    protected VideoDigital(String titulo, double tamanhoMB, int duracaoMin)throws ItemInvalidoException{
        super(titulo, tamanhoMB);
        if(duracaoMin<=1)
            throw new ItemInvalidoException("A duracao do video deve ter mais de um minuto");

        this.duracaoMin = duracaoMin;
    }

    @Override
    public String getDescricao(){
        return "Video: " + super.getTitulo() + " - " + this.duracaoMin + " | tamanho: " + super.getTamanhoMB() + "MB";
    
    }
}