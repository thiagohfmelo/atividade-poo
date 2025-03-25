package br.unicap.poo.atividade.questao_12;

public class Main {
    public static void main(String[] args) {
        SessaoCinema sessao1 = new SessaoCinema("Vingadores", "20:00", 100, 0);
        sessao1.venderIngresso();
        sessao1.exibirInfoSessao();
        sessao1.alterarHorario("21:00");
        sessao1.exibirInfoSessao();
    }
}
