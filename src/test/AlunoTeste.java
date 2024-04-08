package test;

import dominio.Aluno;
import dominio.SistemaDeCadastroDeAluno;

public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("José", 15, "0001");
        Aluno aluno2 = new Aluno("José", 15, "0002");

//        Double[] notas1 = {7.5, 8.6, 9.0, 5.0};
//        aluno1.adicionarNotas(notas1);


        aluno1.adicionarNotas(7.5);
        aluno1.adicionarNotas(8.6);
        aluno1.adicionarNotas(9.0);
        aluno1.adicionarNotas(5.0);

        System.out.println(aluno1);

        SistemaDeCadastroDeAluno sistema = new SistemaDeCadastroDeAluno();
        Aluno[] alunos = {aluno1, aluno2};
        sistema.adicionaAluno(alunos);
        System.out.println(sistema);


    }


}
