package lista_4.questao1;

public class ContaBancaria {
    private String titular;
    private String numero;
    private double saldo;

    public ContaBancaria(String titular, String numero){
        this.titular=titular;
        this.numero=numero;
        saldo = 0.0;
    }

    public boolean depositar(double saldo){
        if(saldo>0&&isTitular()){
            this.saldo+=saldo;
            System.out.println("Titular" + titular + " | Deposito realizado com sucesso");
            return true;
        }
        System.out.println("Erro ao realizar deposito");
        return false;
    }

    public boolean sacar(double saldo){
        if(isTitular()&&saldo<=this.saldo){
            this.saldo-=saldo;
            System.out.println("Titular"+ titular + " | Saque realizado com sucesso");
            return true;
        }
        System.out.println("Erro ao realizar o saque");
        return false;
    }

    public boolean transferir(ContaBancaria r, double valor){
        if(isTitular() && valor>0&&this.saldo-valor>=0){
            r.depositar(valor);
            System.out.printf("Transferencia realizada com sucesso\nRemetende %s \n Destinatario: %s \n Valor: R$ %.2f\n", titular, r.getTitular(), valor);
            saldo-=valor;
            return true;
        }
        System.out.println("falha ao realizar transferencia");
        return false;
    }

    double getSaldo(){
        return saldo;
    }

    String getTitular(){
        return titular;
    }

    void setTitular(String nome){
        if(nome==null || nome.isEmpty()){
            titular=nome;
            System.out.println("novo nome cadastrado");
            return;
        }
        System.out.println("erro ao cadastrar nome");
    }

    void setNumero(String numero){
        if(numero.isBlank() && numero!=null){
            this.numero=numero;
            System.out.println("novo numero cadastrado");
        }
        this.numero = "1234";
    }

    boolean isTitular(){
        if(titular!=null&&!titular.equals("nome invalido"))
            return true;

        return false;
    }

    

    

}
