package br.unicap.poo.atividade.questao_06;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("ABC-1234", "Toyota", 2020);
        Veiculo v2 = new Veiculo("XYZ-5678", "Honda", 2018);
        Veiculo v3 = new Veiculo("JKL-9101", "Ford", 2022);

        v1.exibirVeiculo();
        v2.exibirVeiculo();
        v3.exibirVeiculo();
    }
}
