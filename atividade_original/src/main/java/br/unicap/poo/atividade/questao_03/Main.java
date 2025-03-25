package br.unicap.poo.atividade.questao03;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Caderno", 15.50, 10);
        Produto produto2 = new Produto("Caneta", 2.30, 50);

        produto1.exibirInfoProduto();
        produto2.exibirInfoProduto();
    }
}
