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

    public boolean adicionarDisciplina(String d) {
        return this.disciplinas.add(d);
    }

    public boolean adicionarTelefone(String t) {
        return this.telefones.add(t);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("Matrícula: " + matricula + "\n");
        sb.append("Nome: " + nome + "\n");
        sb.append("Filiação: \n");
        sb.append("   Pai: " + this.filiacao.get(0) + "\n");
        sb.append("   Mãe: " + this.filiacao.get(1) + "\n");


        sb.append("Telefones: ");

        for (String elemento : telefones) {
            sb.append("\n   - ").append(elemento);
        }

        sb.append("\nDisciplinas: ");

        for (String elemento : disciplinas) {
            sb.append("\n   - ").append(elemento);
        }

        return sb.toString();
    }

}
