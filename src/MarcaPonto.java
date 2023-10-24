import java.time.LocalDate;

public class MarcaPonto extends Funcionario {
    private LocalDate dataHora;


    public MarcaPonto(String cargo, String setor, LocalDate dataHora) {
        super(cargo, setor);
        this.dataHora = dataHora;

    }

    public LocalDate getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDate dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "MarcaPonto{" +
                "dataHora=" + dataHora +
                '}';
    }
}
