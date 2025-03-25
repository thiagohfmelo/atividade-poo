package br.unicap.poo.atividade.questao_10;

public class Pedido {
    private int numeroPedido;
    private String descricaoItens;
    private double valorTotal;

    public Pedido() {}

    public Pedido(int numeroPedido, String descricaoItens, double valorTotal) {
        this.numeroPedido = numeroPedido;
        this.descricaoItens = descricaoItens;
        this.valorTotal = valorTotal;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getDescricaoItens() {
        return descricaoItens;
    }

    public void setDescricaoItens(String descricaoItens) {
        this.descricaoItens = descricaoItens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void exibirPedido() {
        System.out.println("Pedido nº: " + numeroPedido + ", Itens: " + descricaoItens + ", Total: R$ " + valorTotal);
    }
}
