package lista_2.questao2;
import java.util.Scanner;

public class TesteFuncionario {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Funcionario f1 = new Funcionario("João", 20, 3.5);
        Funcionario f2 = new Funcionario("Mateus", 40, 5.5);
        Funcionario f3 = new Funcionario("Lucas", 40, 13.5);

        System.out.printf("Funcionario: %s\nValor recebido: R$ %.2f\n", f1.nome, f1.calcularSalario());
        System.out.printf("Funcionario: %s\nValor recebido: R$ %.2f\n", f2.nome, f2.calcularSalario());
        System.out.printf("Funcionario: %s\nValor recebido: R$ %.2f\n", f3.nome, f3.calcularSalario());

        System.out.println(">>> CADASTRO DE PESSOAS <<<");

        Funcionario fp1 = new Funcionario();
        Funcionario fp2 = new Funcionario();
        Funcionario fp3 = new Funcionario();

        for(int i=1; i<=3; i++){
            System.out.println("Insira o nome da pessoa:");
            String tempNome = sc.nextLine();
            System.out.println("Insira a quantidade de horas trabalhadas");
            int tempHoras = sc.nextInt();
            System.out.println("Insira o valor por hora trabalhada");
            double tempvalor = sc.nextDouble();

            if(i==1){
                fp1.nome = tempNome;
                fp1.horasTrabalhadas = tempHoras;
                fp1.valorHora = tempvalor;
            }
            if(i==2){
                fp2.nome = tempNome;
                fp2.horasTrabalhadas = tempHoras;
                fp2.valorHora = tempvalor;
            }
            if(i==3){
                fp3.nome = tempNome;
                fp3.horasTrabalhadas = tempHoras;
                fp3.valorHora = tempvalor;
            }
            
            tempNome = sc.nextLine();
            tempNome="";
            tempHoras=0;
            tempvalor=0;
        }

        System.out.printf("Funcionario: %s\nValor recebido: R$ %.2f\n", fp1.nome, fp1.calcularSalario());
        System.out.printf("Funcionario: %s\nValor recebido: R$ %.2f\n", fp2.nome, fp2.calcularSalario());
        System.out.printf("Funcionario: %s\nValor recebido: R$ %.2f\n", fp3.nome, fp3.calcularSalario());
        
        sc.close();
    }
}
