import java.time.LocalDate;

public class HorarioTrabalho extends Funcionario{
    private LocalDate entrada;
    private LocalDate saida;
    private Integer horasAlmoco;

    public HorarioTrabalho(String cargo, String setor, LocalDate entrada, LocalDate saida, Integer horasAlmoco) {
        super(cargo, setor);
        this.entrada = entrada;
        this.saida = saida;
        this.horasAlmoco = horasAlmoco;
    }

    public LocalDate getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDate entrada) {
        this.entrada = entrada;
    }

    public LocalDate getSaida() {
        return saida;
    }

    public void setSaida(LocalDate saida) {
        this.saida = saida;
    }

    public Integer getHorasAlmoco() {
        return horasAlmoco;
    }

    public void setHorasAlmoco(Integer horasAlmoco) {
        this.horasAlmoco = horasAlmoco;
    }

    @Override
    public String toString() {
        return "HorárioTrabalho{" +
                "entrada=" + entrada +
                ", saida=" + saida +
                ", horasAlmoco=" + horasAlmoco +
                '}';
    }
}

