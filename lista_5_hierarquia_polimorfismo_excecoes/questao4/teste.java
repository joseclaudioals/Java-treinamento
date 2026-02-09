package lista_5_hierarquia_polimorfismo_excecoes.questao4;

public class teste {
    public static void main(String[] args) {
        try {
            Pasta p = new Pasta("arquivos_fodinhas");
            NodeSistema a1 = new Arquivo("Aula.mp4", 78000);
            NodeSistema a2 = new Arquivo("livro.pdf", 17819);
            NodeSistema a3 = new Arquivo("OBS.exe", 1822);
            
            p.addArquivo(a1);
            p.addArquivo(a2);
            p.addArquivo(a3);

            System.out.println("tamanho da pasta "+ p.getNome() +": " + p.getTamanho());
            
        } catch (ArquivoInvalidoExeception e) {
            System.err.println("Erro ao inicializar um arquivo: "+ e.getMessage());
        }
    }
    
}
