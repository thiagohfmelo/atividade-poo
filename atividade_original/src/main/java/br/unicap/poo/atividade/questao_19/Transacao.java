package br.unicap.poo.atividade.questao19;

import java.util.ArrayList;

public class Transacao {
    private String descricao;
    private double valor;
    private String tipo;

    public Transacao() {}

    public Transacao(String descricao, double valor, String tipo) throws IllegalArgumentException {
        if (!tipo.equalsIgnoreCase("receita") && !tipo.equalsIgnoreCase("despesa")) {
            throw new IllegalArgumentException("O tipo da transação deve ser 'receita' ou 'despesa'.");
        }
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }

    public void alterarDescricao(String novaDescricao) {
        this.descricao = novaDescricao;
    }

    public void exibirTransacao() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: R$" + valor);
        System.out.println("Tipo: " + tipo);
    }

    public static double calcularSaldo(ArrayList<Transacao> transacoes) {
        double saldo = 0;
        for (Transacao t : transacoes) {
            if (t.tipo.equalsIgnoreCase("receita")) {
                saldo += t.valor;
            } else {
                saldo -= t.valor;
            }
        }
        return saldo;
    }
}
