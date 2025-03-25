package br.unicap.poo.atividade.questao01;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        Livro livro3 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605);

        livro1.exibirInfoLivro();
        livro2.exibirInfoLivro();
        livro3.exibirInfoLivro();
    }
}
