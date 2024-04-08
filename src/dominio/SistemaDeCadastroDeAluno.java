package dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SistemaDeCadastroDeAluno {
    private Aluno[] alunos;

    public SistemaDeCadastroDeAluno(){

    }

    public void adicionaAluno(Aluno[] alunos){
        this.alunos = alunos;
    }

    public String buscarAlunoPorNome(String nomeAluno) {
        List<String> listaDeAlunos = new ArrayList<>();

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].getNome().equalsIgnoreCase(nomeAluno)) {
                listaDeAlunos.add(String.valueOf(alunos[i]));
            }
        }

        if (!listaDeAlunos.isEmpty()) {
            return listaDeAlunos.toString();
        } else {
            return "Aluno não encontrado";
        }
    }

    public Aluno buscarAlunoPorNumDeMatricula(String numeroDeMatricula) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].getNumeroDeMatricula().equalsIgnoreCase(numeroDeMatricula)) {
                return alunos[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Alunos matriculados: " + Arrays.toString(alunos);
    }
}
