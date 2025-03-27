package br.unicap.poo.atividade.questao17;

public class Main {
    public static void main(String[] args) {
        Votacao candidato1 = new Votacao("João");
        Votacao candidato2 = new Votacao("Maria");

        candidato1.adicionarVoto();
        candidato1.adicionarVoto();
        candidato2.adicionarVoto();

        candidato1.exibirResultado();
        candidato2.exibirResultado();

        candidato1.compararVotos(candidato2);
    }
}