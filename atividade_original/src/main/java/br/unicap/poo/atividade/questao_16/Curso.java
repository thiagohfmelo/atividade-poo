package br.unicap.poo.atividade.questao16;

public class Curso {
    private String nome;
    private String categoria;
    private int cargaHoraria;
    private int numeroDeAlunosInscritos;

    public Curso(String nome, String categoria, int cargaHoraria, int numeroDeAlunosInscritos) {
        this.nome = nome;
        this.categoria = categoria;
        this.cargaHoraria = cargaHoraria;
        this.numeroDeAlunosInscritos = numeroDeAlunosInscritos;
    }

    public void inscreverAluno() {
        numeroDeAlunosInscritos++;
    }

    public void cancelarInscricao() {
        if (numeroDeAlunosInscritos > 0) {
            numeroDeAlunosInscritos--;
        } else {
            throw new IllegalArgumentException("Não há alunos inscritos para cancelar.");
        }
    }

    public void atualizarCargaHoraria(int novaCargaHoraria) {
        if (novaCargaHoraria > 0) {
            this.cargaHoraria = novaCargaHoraria;
        } else {
            throw new IllegalArgumentException("Carga horária deve ser positiva.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Curso: " + nome + ", Categoria: " + categoria +
                ", Carga Horária: " + cargaHoraria + "h, Alunos Inscritos: " + numeroDeAlunosInscritos);
    }
}