package br.unicap.poo.atividade.questao02;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Maria", 16, "2º Ano");
        Aluno aluno2 = new Aluno("João", 17, "3º Ano");
        Aluno aluno3 = new Aluno("Lucas", 15, "1º Ano");

        aluno1.exibirInfoAluno();
        aluno2.exibirInfoAluno();
        aluno3.exibirInfoAluno();
    }
}
