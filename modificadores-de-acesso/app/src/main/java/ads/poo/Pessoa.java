package ads.poo;

import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa() {

    }

    public void definirNome(String nome) {
        this.nome = nome;
    }

    public void definirCpf(String cpf) {
        this.cpf = cpf;
    }

    public String obterNome() {
        return this.nome;
    }

    public String obterCpf() {
        return this.cpf;
    }

    public String toString() {
        return "Nome = " + nome + ", " + "CPF = " + cpf;
    }
}
