package br.unicap.poo.atividade.questao_11;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("1234", 500.0, "Lucas");
        ContaCorrente conta2 = new ContaCorrente("5678", 300.0, "Ana");

        conta1.depositar(100.0);
        conta2.sacar(50.0);
        conta1.transferir(conta2, 200.0);
        
        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}
