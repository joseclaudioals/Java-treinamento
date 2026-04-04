package lista_6.questao5;
import java.math.BigDecimal;
import java.time.*;
import java.util.ArrayList;
import java.util.Objects;

public class Consulta {
    private Medico medico;
    private Paciente paciente;
    private BigDecimal valor;
    private  LocalDateTime horario;

    public Consulta(Medico medico, Paciente paciente, String valor, LocalDateTime horario){
        setMedico(medico);
        setPaciente(paciente);
        setValor(valor);
        setHorario(horario, medico);
    }

    @Override
    public String toString(){
        return "\nMedico: " + medico.getNome() + "\nPaciente: " + paciente.getNome() +
                "\nValor: R$ " + valor.toString() + "\nData e hora: "+ horario.toString();
    }

    void verificaAgenda(ArrayList<Consulta> agenda, LocalDateTime horario, String medicoNome)throws HorarioIndisponivelExcepion{
        for(Consulta c:agenda){
            // se o horario for igual, e estiver entre uma hora de um horario já marcado
            if(horario.equals(c.horario) && horario.isAfter(c.horario) && horario.isBefore(c.horario.plusHours(1)))
                throw new HorarioIndisponivelExcepion("o Dr. " + medicoNome + "esta ocupado as " + horario.getHour() + "nesta data\nSelecione outro horario e outra data");
        }
    }

    // -- setters

    public void setMedico(Medico medico) {
        this.medico = Objects.requireNonNull(medico, "O medico deve ser valido no sistema");
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = Objects.requireNonNull(paciente, "o paciente deve ser valido no sistema");
    }

    public void setValor(String valor) {
        double val = Double.parseDouble(valor);

        if(val<=0)
            throw new HorarioIndisponivelExcepion("O valor da consulta está igual a 0 ou negativo");

        this.valor = new BigDecimal(valor);
    }

    // metodo incompleto
    public void setHorario(LocalDateTime horario, Medico medico)throws HorarioIndisponivelExcepion{
        if(!horario.isBefore(LocalDateTime.now()))
            throw new HorarioIndisponivelExcepion("A data e o horario devem ser diferentes da data e horario atuais");

        LocalDate hoje = LocalDate.now();
        LocalTime inicioHora = LocalTime.of(8, 0);
        LocalTime fimHora = LocalTime.of(17,30);

        LocalDateTime inicioExpediente = hoje.atTime((inicioHora));

        verificaAgenda(medico.getAgenda(), horario, medico.getNome());

        this.horario = horario;
    }
}
