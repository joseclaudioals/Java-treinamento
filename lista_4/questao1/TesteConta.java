package lista_4.questao1;

public class TesteConta {
    public static void main(String[] args){
        ContaBancaria c = new ContaBancaria(null, null);

        ContaBancaria b = new ContaBancaria("Zequinha louco", "6924");

        
        b.depositar(719);
        c.depositar(289);
        c.setTitular("Maria maloca");
        c.setNumero("2469");
        b.sacar(17);
        c.sacar(22);
        System.out.printf("Titular: %s | Saldo: R$ %.2f\n", c.getTitular(), c.getSaldo());
        b.transferir(c, 180);
        System.out.printf("Titular: %s | Saldo: R$ %.2f\n", c.getTitular(), c.getSaldo());
        System.out.printf("Titular: %s | Saldo: R$ %.2f\n", b.getTitular(), b.getSaldo());

    }
    
}
