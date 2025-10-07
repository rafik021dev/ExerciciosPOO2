import java.util.ArrayList;
import java.util.List;

public class Matricula {
    private Situacao situacao;

    private Aluno aluno;
    private Disciplina disciplina;

    public Matricula(Aluno aluno, Disciplina disciplina) {
        this.aluno = aluno;
        this.disciplina = disciplina;
    }
    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public Situacao getSituacao() {
        return situacao;
    }
    public void detalhesMatricula() {
        System.out.println("Detalhes da Matrícula:");
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Situação: " + situacao);
    }
}