package lista_4.questao6;
import java.util.List;

public class teste {
    public static void main(String[] args){
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("savina", "111111111");
        agenda.adicionarContato("zezin das tripa", "2222222222");
        agenda.adicionarContato("mamae", "3333333333");
        agenda.adicionarContato("namorada", "444444444");
        agenda.adicionarContato("robertinho", "555555555");
        agenda.adicionarContato("zezin das tripa", "2222222222");

        Contato zezin = agenda.buscarContato("zezin das tripa");

        System.err.println("Nome: "+zezin.getnome()+"\nTelefone: "+ zezin.getTelefone());

        agenda.removerContato("zezin das tripa");

        List<Contato> copia = agenda.listarContatos();

        for(int i=0; i<copia.size(); i++){
            System.err.println("Nome: "+copia.get(i).getnome()+"\nTelefone: "+ copia.get(i).getTelefone());
        }
    }
    
}
