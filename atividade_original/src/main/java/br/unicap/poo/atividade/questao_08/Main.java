package br.unicap.poo.atividade.questao_08;

public class Main {
    public static void main(String[] args) {
        Evento e1 = new Evento("Show de Música", "10/04/2025", "Arena Multishow");
        Evento e2 = new Evento("Teatro Nacional", "15/05/2025", "Teatro Municipal");
        Evento e3 = new Evento("Exposição de Arte", "25/06/2025", "Museu de Arte Moderna");

        e1.exibirEvento();
        e2.exibirEvento();
        e3.exibirEvento();
    }
}
