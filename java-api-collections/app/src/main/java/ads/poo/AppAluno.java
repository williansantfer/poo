package ads.poo;

import java.util.ArrayList;

public class AppAluno {

    public static void main(String[] args) {

        Aluno a = new Aluno("Juca", 123, "Bob", "Ana");

        a.adicionarDisciplina("POO");
        a.adicionarDisciplina("Seg-Info");

        a.adicionarTelefone("(99) 99999-9999");
        a.adicionarTelefone("(88) 98888-8888");

        System.out.println(a);

    }

}
