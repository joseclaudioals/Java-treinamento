package lista_6.questao1;

public class Elevador {
    private int andarAtual;// 0 equivale ao terreo
    private int qntPessoas;
    private double peso;
    private boolean porta; //se true aberta, se nao, fechada

    Elevador() {
        andarAtual = 0;
        qntPessoas = 0;
        peso = 0.0;
        porta = false;
    }

    void entrarElevador(int qntPessoas, double peso) {
        porta = true;

        System.out.println("entrando no elevador...");

        try {
            setQntPessoas(qntPessoas);
            setPeso(peso);
        } catch (ElevadorLotadoException e) {
            System.out.println("Elevador lotado: " + e.getMessage());
        }

    }

    void sairElevador(int qntPessoas, double peso) {
        porta = true;
        System.out.println("saindo do elevador...");

        try {
            setQntPessoas(qntPessoas * -1);
            setPeso(peso * -1);
        } catch (ElevadorLotadoException e) {
            System.out.println("ERRO: valor inserido invalido");
        }

        if(this.qntPessoas==0) porta = false;
    }

    void moverPara(int andar) {
        int andarAntigo = andarAtual;
        setAndarAtual(andar);
        if (andarAtual == andarAntigo) {
            System.out.println("o elevador está parado");
            return;
        }
        porta = false;
        if (andarAtual > andarAntigo) {
            System.out.println("o elevador esta subindo");
            for (int i = andarAntigo; i <= andarAtual; i++) {
                System.out.println("Andar: " + i);
                if (i == andarAtual) System.out.println("Voce chegou ao seu andar!!");
            }
        } else {
            System.out.println("o elevador esta descendo");
            for (int i = andarAntigo; i >= andarAtual; i--) {
                System.out.println("Andar: " + i);
                if (i == andarAtual) System.out.println("Voce chegou ao seu andar!!");
            }
        }
    }

    // setters
    private void setAndarAtual(int andarAtual) {
        if (andarAtual >= 0 && andarAtual <= 20) {
            this.andarAtual = andarAtual;
        } else
            System.out.println("andar nao existente\nEscolha um andar entre 0 à 20!");
    }

    private void setQntPessoas(int qntPessoas) throws ElevadorLotadoException {
        if ((this.qntPessoas + qntPessoas <= 8 && this.qntPessoas + qntPessoas >=0) || qntPessoas < 0 && qntPessoas >= -8) {
            this.qntPessoas += qntPessoas;
        } else {
            throw new ElevadorLotadoException("o elevador excedeu o limite maximo de pessoas");
        }
    }

    private void setPeso(double peso) throws ElevadorLotadoException {
        if ((this.peso + peso <=600 && this.peso <=0)|| peso < 0 && peso >= -600) {
            this.peso += peso;
        } else {
            throw new ElevadorLotadoException("o elevador excedeu o limite maximo do peso permitido");
        }
    }
}
