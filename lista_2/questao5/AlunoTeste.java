package lista_2.questao5;
import java.util.Scanner;

public class AlunoTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        String tempmatricula ="", tempnome ="";
        double tempn1=0.0, tempn2=0.0, tempnt=0.0;

        System.out.println(" >>>> CADASTRO DE ALUNOS <<<< ");
        for(int i=1; i<=3; i++){
            System.out.println("Insira o nome do aluno:");
            tempnome = sc.nextLine();
            System.out.println("Insira a matricula:");
            tempmatricula = sc.nextLine();
            System.out.println("Insira a primeira nota");
            tempn1 = sc.nextDouble();
            System.out.println("Insira a segunda nota:");
            tempn2 = sc.nextDouble();
            System.out.println("Insira a nota do trabalho avaliativo");
            tempnt = sc.nextDouble();
            
            if(i==1){
                a1.matricula = tempmatricula;
                a1.nome = tempnome;
                a1.nota1 = tempn1;
                a1.nota2 = tempn2;
                a1.notaTrabalho = tempnt;
                a1.media = a1.media(a1.nota1, a1.nota2, a1.notaTrabalho);

                System.out.printf("\nMatricula do aluno: %s\nNome do Aluno: %s\nNota 1: %.2f\nNota 2: %.2f\nNota Avaliativa: %.2f\nMedia do Aluno: %.2f", a1.matricula, a1.nome,a1.nota1,a1.nota2,a1.notaTrabalho,a1.media);

                if((a1.provaFinal()))
                    System.out.printf("O aluno precisa de %.2f para passar\n", 28-(a1.media*3));
                    else 
                        System.out.printf("O aluno esta passado\n");
            }

            if(i==2){
                a2.matricula = tempmatricula;
                a2.nome = tempnome;
                a2.nota1 = tempn1;
                a2.nota2 = tempn2;
                a2.notaTrabalho = tempnt;
                a2.media = a2.media(a2.nota1, a2.nota2, a2.notaTrabalho);

                System.out.printf("\nMatricula do aluno: %s\nNome do Aluno: %s\nNota 1: %.2f\nNota 2: %.2f\nNota Avaliativa: %.2f\nMedia do Aluno: %.2f", a2.matricula, a2.nome,a2.nota1,a2.nota2,a2.notaTrabalho,a2.media);

                if((a1.provaFinal()))
                    System.out.printf("O aluno precisa de %.2f para passar\n", 28-(a1.media*3));
                    else 
                        System.out.printf("O aluno esta passado\n");
            }

            if(i==3){
                a3.matricula = tempmatricula;
                a3.nome = tempnome;
                a3.nota1 = tempn1;
                a3.nota2 = tempn2;
                a3.notaTrabalho = tempnt;
                a3.media = a3.media(a3.nota1, a3.nota2, a3.notaTrabalho);

                System.out.printf("\nMatricula do aluno: %s\nNome do Aluno: %s\nNota 1: %.2f\nNota 2: %.2f\nNota Avaliativa: %.2f\nMedia do Aluno: %.2f", a3.matricula, a3.nome,a3.nota1,a3.nota2,a3.notaTrabalho,a3.media);

                if((a3.provaFinal()))
                    System.out.printf("O aluno precisa de %.2f para passar\n", 28-(a1.media*3));
                    else 
                        System.out.printf("O aluno esta passado\n");
            }
            tempnome = sc.nextLine();
            tempnome = "";
            tempmatricula = "";
            tempn1 = 0.0;
            tempn2 = 0.0;
            tempnt = 0.0;
            
        }
        sc.close();
    }
}
