package lista_4.questao5;
import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<String> musicas;

    protected Playlist(String nome){
        setNome(nome);
        this.musicas = new ArrayList<>();
    }

    protected void addMusica(String nomeMusica){
        if(nomeMusica!=null && !nomeMusica.isBlank()){
            musicas.add(nomeMusica);
            return;
        }
        System.out.println("nao foi possivel adicionar musica");
    }
    
    protected boolean removeMusica(String nomeMusica){
        if(nomeMusica!=null && !nomeMusica.isEmpty()){
            int i=0;
            for(;i<musicas.size(); i++){
                if(nomeMusica.equals(musicas.get(i))){
                    break;
                }
            }
            if(i < musicas.size()){
                musicas.remove(i);
                System.out.println("musica removida com sucesso");
                return true;
            }
        }

        System.out.println("musica nao encontrada");
        return false;
    }

    protected List<String> listarMusicas(){
        return List.copyOf(this.musicas);
    }

    protected int qntMusicas(){
        return musicas.size();
    }

    protected void showPlaylist(){
        System.err.println(nome);
        for(int i=0; i<musicas.size(); i++)
            System.out.println(musicas.get(i));
    }

    private void setNome(String nome){
        if(nome!=null && !nome.isBlank()){
            this.nome=nome;
        }
    }
}
