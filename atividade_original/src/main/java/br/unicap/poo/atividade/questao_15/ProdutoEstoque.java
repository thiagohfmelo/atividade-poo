package br.unicap.poo.atividade.questao15;

public class ProdutoEstoque {
    private String nome;
    private int quantidade;
    private double precoUnitario;

    public ProdutoEstoque() {}

    public ProdutoEstoque(String nome, int quantidade, double precoUnitario) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getQuantidade() { return quantidade; }
    public void adicionarEstoque(int quantidade) { this.quantidade += quantidade; }

    public void removerEstoque(int quantidade) throws Exception {
        if (quantidade > this.quantidade) {
            throw new Exception("Estoque insuficiente!");
        }
        this.quantidade -= quantidade;
    }

    public double getPrecoUnitario() { return precoUnitario; }
    public void atualizarPreco(double novoPreco) { this.precoUnitario = novoPreco; }

    public void exibirProduto() {
        System.out.println("Nome: " + nome + ", Quantidade: " + quantidade + ", Preço: " + precoUnitario);
    }
}
