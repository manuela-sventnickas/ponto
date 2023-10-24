import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", 1, "joao@example.com", "Analista", 50000.0, LocalDate.of(2023, 09, 10));
        Funcionario funcionario2 = new Funcionario("Maria", 2, "maria@example.com", "Gerente de Projetos", 80000.0, LocalDate.of(2023, 02, 25));




        // Simulação de  marcações de ponto
        MarcaPonto marca1 = new MarcaPonto(funcionario1.getId(), LocalDate.of(2023,07,25));
        MarcaPonto marca2 = new MarcaPonto(funcionario1.getId(), LocalDate.of(2023,08.23);



        //horários de trabalho
        HorarioTrabalho horario1 = new HorarioTrabalho(funcionario1.getId());


    }
    }
}