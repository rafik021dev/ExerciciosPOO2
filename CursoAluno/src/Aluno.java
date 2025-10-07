public class Aluno {

    private String nome;
    private String matricula;
    private Curso curso;

    public Aluno(String nome, String matricula, Curso curso ) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    //nao sabia que quando retornava objetos, nao precisava do this
    public Curso getCurso() {
        return curso;
    }
    public String getNome() {
        return nome;
    }

    public String toString() {
        return "Aluno:" + nome + "(Matrícula:" + matricula + ")";
    }



}
