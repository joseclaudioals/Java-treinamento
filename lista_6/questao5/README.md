### Nível 5: Desafio Final (Exceções e Regras Complexas)

**Cenário: Sistema de Agenda Médica**

Um consultório precisa garantir que médicos não marquem dois pacientes no mesmo horário e que pacientes não agendem consultas no passado.

**Requisitos:**

1. **Datas:** Use a API `LocalDateTime` do Java
2. **Classes:** `Medico`, `Paciente`, `Consulta`.
3. **Exceções Personalizadas:** Crie `HorarioIndisponivelException` e `PacienteBloqueadoException`.
4. **Agenda:** O médico possui uma lista de consultas agendadas.
5. **A Lógica de Agendamento:** Ao tentar criar uma consulta:
    - Verifique se a data é futura.
    - Verifique se o médico já tem alguém naquele horário (considere que a consulta dura 1 hora). Se tiver, lance a exceção `HorarioIndisponivelException`.
    - Trate essa exceção na classe `Main` com uma mensagem amigável ("O Dr. João já está ocupado às 14h").

**O que você vai treinar:**

- Manipulação de Datas e Horas (API moderna do Java 8+).
- Criação e lançamento de `Exceptions`.
- Validação de conflitos em listas.