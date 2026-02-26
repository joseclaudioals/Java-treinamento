package lista_6.questao3;

public class Teste {
    public static void main(String[] args){
        Usuario u = new Usuario("Jose Claudio");

        u.adicionarFavorito("Superman", "acao", 2025, 131);
        u.adicionarFavorito("Toy Story","animacao", 1996, 87);
        u.adicionarFavorito("Pacificador", "ACAO", 2022, 2, 8);
        u.adicionarFavorito("uma aventura LEGO", "animacao", 2014, 100);

        u.listarFavoritos();

        try{
            u.adicionarFavorito("", "", -1, 89102);
        }catch(IllegalArgumentException e){
            System.out.println("falha ao criar uma das variaveis: erro nos argumentos");
        }
    }
}
