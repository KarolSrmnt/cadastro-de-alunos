package dominio;

import java.util.Arrays;

public class Aluno {
    private String nome;
    private int idade;
    private Double[] notas;
    private String numeroDeMatricula;

    public Aluno(String nome, int idade, String numeroDeMatricula) {
        this.nome = nome;
        this.idade = idade;
        this.numeroDeMatricula = numeroDeMatricula;
        notas = new Double[4];
    }

    public Aluno(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public Double[] getNotas() {
        return notas;
    }

    public void adicionarNotas(Double nota){
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] == null){
                notas[i] = nota;
                break;
            }
        }
    }

    public void adicionarNotas(Double[] notas){
        this.notas = notas;
    }

    public Double calcularMedia() {
        Double soma = 0.0;
        int cont = 0;

        for (Double nota : notas) {
            if (nota != null) {
                soma += nota;
                cont++;
            }
        }

        return cont > 0 ? soma / notas.length : 0.0;
    }


    @Override
    public String toString() {
        return  "Nome: '" + nome + '\'' +
                ", número de matrícula: " + numeroDeMatricula +
                ", idade: " + idade +
                ", notas: " + Arrays.toString(notas) +
                String.format(", média: %.2f", calcularMedia()) +
                String.format("\n");
    }
}
