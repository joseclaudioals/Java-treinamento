package lista_6.questao5;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class teste {
    public static void main(String[] args) {
        System.out.println("--- Iniciando Sistema de Clínica Médica ---");

        // 1. Criar Médicos e Pacientes
        Medico medico = new Medico("Dr. João", "Cardiologia");
        Paciente paciente1 = new Paciente("Ana Silva", LocalDate.of(1990, 5, 15));
        Paciente paciente2 = new Paciente("Carlos Costa", LocalDate.of(1985, 10, 20));

        // 2. Definir um horário válido no futuro (Amanhã às 14:00)
        LocalDateTime horarioValido = LocalDateTime.now().plusDays(1).withHour(14).withMinute(0);

        System.out.println("\n[TESTE 1] Tentando agendar consulta válida...");
        try {
            medico.marcarConsulta(paciente1, "150.00", horarioValido);
            System.out.println("Consulta agendada com sucesso para " + paciente1.toString().split("\n")[1]);
        } catch (HorarioIndisponivelExcepion e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\n[TESTE 2] Tentando agendar no mesmo horário (Conflito)...");
        try {
            // Tenta marcar o paciente2 exatamente para a mesma data e hora do paciente1
            medico.marcarConsulta(paciente2, "200.00", horarioValido);
        } catch (HorarioIndisponivelExcepion e) {
            // Tratamento da mensagem amigável conforme exigido no README
            System.out.println("O " + medico.getNome() + " já está ocupado às 14h.");
        }

        System.out.println("\n[TESTE 3] Tentando agendar no passado...");
        try {
            LocalDateTime horarioPassado = LocalDateTime.now().minusDays(5);
            Paciente paciente3 = new Paciente("Rui", LocalDate.of(2000, 1, 1));
            medico.marcarConsulta(paciente3, "100.00", horarioPassado);
        } catch (HorarioIndisponivelExcepion e) {
            System.out.println("Acesso negado: " + e.getMessage());
        }

        System.out.println("\n--- Agenda Final ---");
        medico.verificarAgenda();
    }
}