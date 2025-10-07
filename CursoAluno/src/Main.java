import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso BCC = new Curso("Ciencia da Computação");
        Professor Curvello = new Professor("Curvello");

        Aluno RafaelSardinha = new Aluno("Rafael Sardinha", "2025002930", BCC);

        Disciplina poo = new Disciplina("1", "POO", true);

        Matricula Rafael = new Matricula(RafaelSardinha, poo);

        Rafael.setSituacao(Situacao.APROVADO);

        Rafael.detalhesMatricula();
    }
}