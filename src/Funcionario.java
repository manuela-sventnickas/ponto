import java.time.LocalDate;

public class Funcionario extends Usuario{
    private String cargo;
    private  String setor;


    public Funcionario(String cargo, String setor) {
        this.cargo = cargo;
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cargo='" + cargo + '\'' +
                ", setor='" + setor + '\'' +
                '}';
    }
}
