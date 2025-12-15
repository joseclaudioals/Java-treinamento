package lista_4.questao3;

public class CadastroUser {
    private String login;
    private String email;
    private String senha;

    protected CadastroUser(String login, String email, String senha){
        setLogin(login);
        setEmail(email);
        setSenha(senha);
    }  

    // setters privados

    private boolean setLogin(String login){
        if(login.matches("^\\S{5,15}$")){
            this.login=login;
            return true;
        }
        System.out.println("Login invalido");
        return false;
    }
    private boolean setEmail(String email){
        if(email.matches(".+@.+\\..+")){
            this.email = email;
            return true;
        }
        System.out.println("Email invalido");
        return false;
    }

    private boolean setSenha(String senha){
        if(senha.matches("^(?=.*\\d).{8,}$")){
            this.senha = senha;
            return true;
        }
        System.out.println("Senha invalida");
        return false;
    }

    // metodos publicos 
    
    public boolean alterarEmail(String novoEmail){
        if(setEmail(novoEmail))
            return true;

        return false;
    }

    public boolean alterarSenha(String novaSenha){
        if(setSenha(novaSenha))
            return true;

        return false;
    }

    public void showCadastro(){
        System.out.printf("Login: %s | Email: %s | Senha: %s\n", login, email, senha);
    }
}
