import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String codigo;
    private String nome;
    private boolean ofertada;

    public Disciplina(String codigo, String nome, Boolean ofertada) {
        this.codigo = codigo;
        this.nome = nome;
        this.ofertada = ofertada;
    }

    public void setOfertada(boolean ofertada) {
        this.ofertada = ofertada;
    }

    public String getNome() {
        return nome;
    }

}
