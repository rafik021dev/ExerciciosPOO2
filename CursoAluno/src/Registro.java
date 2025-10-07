import java.time.LocalDate;

public class Registro {
    private LocalDate data;
    private String tipo;

    private Professor professor;

    public Registro(LocalDate data, String tipo, Professor professor) {
        this.data = data;
        this.tipo = tipo;
        this.professor = professor;
    }

}
