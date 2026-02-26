package lista_6.questao3;
import java.util.ArrayList;

public class Usuario {
    private String nome;
    private ArrayList<Conteudo> listaFavoritos;

    Usuario(String nome){
        if(!nome.isEmpty() || nome!=null){
            this.nome=nome;
            listaFavoritos = new ArrayList<>();
        }
        else
            throw new IllegalArgumentException();
    }

    void adicionarFavorito(String titulo, String genero, int ano, int duracao){
        Conteudo c = new Filme(titulo, genero, ano, duracao);

        listaFavoritos.add(c);
        System.out.println("Conteudo adicionado a lista");
    }

    void adicionarFavorito(String titulo, String genero, int ano, int temporadas, int epPorTemporada){
        Conteudo c = new Serie(temporadas, epPorTemporada, titulo, ano, genero);

        listaFavoritos.add(c);
        System.out.println("Conteudo adicionado a lista");
    }

    void listarFavoritos(){
        System.out.println("Usuario" + nome);
        for(Conteudo c:listaFavoritos){
            System.out.println("Titulo: " + c.getTitulo());
            System.out.println("Genero: "+ c.getGenero());
            System.out.println("Ano: "+ c.getAno());
            System.out.println("Status: " + (c.isAssistido() ? "assistido":"nao assistido"));
            System.out.println("Duracao: " + c.calcularTempo() + " minutos");
        }
    }
}
