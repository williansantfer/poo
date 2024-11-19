package ads.poo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Aluno {

    private String nome;
    private int matricula;
    private ArrayList<String> filiacao;
    private ArrayList<String> telefones;
    private HashSet<String> disciplinas;

    public Aluno(String nome, int matricula, String pai, String mae) {
        this.nome = nome;
        this.matricula = matricula;
        this.filiacao = new ArrayList<>();
        this.filiacao.add(pai);
        this.filiacao.add(mae);
        this.disciplinas = new HashSet<>();
        this.telefones = new ArrayList<>();
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

    public ArrayList<String> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<String> telefones) {
        this.telefones = telefones;
    }

    public boolean adicionarDisciplina(String d) {
        return this.disciplinas.add(d);
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", filiacao=" + filiacao +
                '}';
    }

    // aluno vai ter nome, 1 matricula, n telefones, filiação (pai e mãe)

    /*
        Disciplinas que o aluno esta cursando (String) guardar sigla;

     */
}
