import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private List<Aluno> alunos = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public String toString() {

    }
}
