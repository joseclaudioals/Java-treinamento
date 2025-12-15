package lista_4.questao3;

public class Teste {
    public static void main (String[] args){
        CadastroUser c1 = new CadastroUser("zeca lindo", "zeca.@lindo", "1234");
        CadastroUser c2 = new CadastroUser("renatin124", "renatin124@lindo.com", "renatoBrabo7");

        c1.alterarEmail("zecalindo@brabo.com");
        c1.alterarSenha("123456789");

        c1.showCadastro();
        c2.showCadastro();
    }
    
}
