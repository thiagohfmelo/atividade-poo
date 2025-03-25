package br.unicap.poo.atividade.questao_11;

public class ContaCorrente {
    private String numeroDaConta;
    private double saldo;
    private String nomeDoTitular;

    public ContaCorrente() {}

    public ContaCorrente(String numeroDaConta, double saldo, String nomeDoTitular) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.nomeDoTitular = nomeDoTitular;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo && valor > 0) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public void transferir(ContaCorrente destino, double valor) {
        if (valor <= saldo && valor > 0) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para transferência.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo da conta de " + nomeDoTitular + " é: R$ " + saldo);
    }
}
