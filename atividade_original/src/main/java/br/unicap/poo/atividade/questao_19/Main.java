package br.unicap.poo.atividade.questao19;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<Transacao> transacoes = new ArrayList<>();

            transacoes.add(new Transacao("Salário", 3000, "receita"));
            transacoes.add(new Transacao("Conta de luz", 200, "despesa"));
            transacoes.add(new Transacao("Compra no mercado", 150, "despesa"));

            for (Transacao t : transacoes) {
                t.exibirTransacao();
                System.out.println("----------------");
            }

            System.out.println("Saldo final: R$" + Transacao.calcularSaldo(transacoes));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
