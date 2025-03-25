package br.unicap.poo.atividade.questao_10;

public class Main {
    public static void main(String[] args) {
        Pedido p1 = new Pedido(101, "Pizza, Refrigerante", 50.0);
        Pedido p2 = new Pedido(102, "Hamburguer, Batata Frita", 35.0);
        Pedido p3 = new Pedido(103, "Macarrão, Salada", 40.0);

        p1.exibirPedido();
        p2.exibirPedido();
        p3.exibirPedido();
    }
}
