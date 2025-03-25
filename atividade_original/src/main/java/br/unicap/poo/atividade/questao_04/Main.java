package br.unicap.poo.atividade.questao_04;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Ana", "TI", 5000);
        Funcionario f2 = new Funcionario("Carlos", "RH", 4500);
        Funcionario f3 = new Funcionario("Mariana", "Financeiro", 6000);

        f1.exibirInformacoes();
        f2.exibirInformacoes();
        f3.exibirInformacoes();
    }
}
