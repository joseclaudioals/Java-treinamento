package lista_4.questao5;
import java.util.List;

public class teste {
    public static void main(String[] args) {
        Playlist p = new Playlist("só as melhores");
        p.addMusica("Magica");
        p.addMusica("by the way");
        p.addMusica("breath");
        p.addMusica("cobertor");
        p.addMusica("Aluninacao");


        List<String> temp = p.listarMusicas();

        p.removeMusica("breath");
        p.showPlaylist();

        for(int i=0;i<temp.size();i++)
            System.out.println(temp.get(i));

        System.out.println("Quantidade de musicas: " + p.qntMusicas());
    }
    
}
