package ads.poo;

public class Estudante {

    private String nome;
    private int matricula;
    private String curso;
    private static int total = 0;

    public Estudante(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        Estudante.total++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Estudante.total = total;
    }

    public String toString() {
        return "Nome = " + this.nome +
                "\nMatrícula = " + this.matricula +
                "\nCurso = " + this.curso;
    }
}
